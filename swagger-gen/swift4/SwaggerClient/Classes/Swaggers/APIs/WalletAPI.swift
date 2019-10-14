//
// WalletAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class WalletAPI {
    /**
     Get wallet fund records
     
     - parameter startDate: (query) Start point for result (optional)
     - parameter endDate: (query) End point for result (optional)
     - parameter currency: (query) Currency type (optional)
     - parameter walletFundType: (query) wallet fund type (optional)
     - parameter page: (query) Page. Default getting first page data (optional)
     - parameter limit: (query) Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func walletGetRecords(startDate: String? = nil, endDate: String? = nil, currency: String? = nil, walletFundType: String? = nil, page: String? = nil, limit: String? = nil, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        walletGetRecordsWithRequestBuilder(startDate: startDate, endDate: endDate, currency: currency, walletFundType: walletFundType, page: page, limit: limit).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get wallet fund records
     - GET /open-api/wallet/fund/records
     - API Key:
       - type: apiKey api-key 
       - name: apiKey
     - API Key:
       - type: apiKey api-signature 
       - name: apiSignature
     - examples: [{contentType=application/json, example=""}]
     
     - parameter startDate: (query) Start point for result (optional)
     - parameter endDate: (query) End point for result (optional)
     - parameter currency: (query) Currency type (optional)
     - parameter walletFundType: (query) wallet fund type (optional)
     - parameter page: (query) Page. Default getting first page data (optional)
     - parameter limit: (query) Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page (optional)

     - returns: RequestBuilder<Any> 
     */
    open class func walletGetRecordsWithRequestBuilder(startDate: String? = nil, endDate: String? = nil, currency: String? = nil, walletFundType: String? = nil, page: String? = nil, limit: String? = nil) -> RequestBuilder<Any> {
        let path = "/open-api/wallet/fund/records"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "start_date": startDate, 
            "end_date": endDate, 
            "currency": currency, 
            "wallet_fund_type": walletFundType, 
            "page": page, 
            "limit": limit
        ])

        let requestBuilder: RequestBuilder<Any>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
