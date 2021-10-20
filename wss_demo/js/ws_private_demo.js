var url = require('url');
var WebSocket = require('ws');
var HttpsProxyAgent = require('https-proxy-agent');
var proxy = 'http://127.0.0.1:1087';
var crypto = require('crypto');
var endpoint = "wss://stream-testnet.bybit.com/realtime"
var parsed = url.parse(endpoint);
console.log('attempting to connect to WebSocket %j', endpoint);
var options = url.parse(proxy);
var agent = new HttpsProxyAgent(options);
var client = new WebSocket(endpoint, { agent: agent });
const apiKey="U7OUiyDdJPVeU7fcxn";
const apiSecret="6o2s1eOnkViVLfyg3zii1k0kf56j5aBNkLRn";
client.on('open', function () {
	console.log('"open" event!');
	console.log('WebSocket Client Connected');
	const expires = new Date().getTime() + 10000;
	const signature = crypto.createHmac("sha256", apiSecret).update("GET/realtime" + expires).digest("hex");
	const payload={
		op: "auth",
		args: [apiKey, expires.toFixed(0), signature],
	}
	client.send(JSON.stringify(payload));
	setInterval(()=>{client.ping()}, 30000);
	client.ping();
	client.send(JSON.stringify({"op": "subscribe", "args": ['order']}));
});

client.on('message', function (data) {
	console.log('"message" event! %j', data);
});
client.on('ping', function (data, flags) {
	console.log("ping received");
});
client.on('pong', function (data, flags) {
	console.log("pong received");
});
