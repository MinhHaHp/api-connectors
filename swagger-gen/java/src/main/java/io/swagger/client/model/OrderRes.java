/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Place new order response
 */
@ApiModel(description = "Place new order response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-14T19:28:07.787+08:00")
public class OrderRes {
  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("qty")
  private String qty = null;

  @SerializedName("time_in_force")
  private String timeInForce = null;

  @SerializedName("order_status")
  private String orderStatus = null;

  @SerializedName("last_exec_time")
  private Double lastExecTime = null;

  @SerializedName("last_exec_price")
  private Double lastExecPrice = null;

  @SerializedName("leaves_qty")
  private BigDecimal leavesQty = null;

  @SerializedName("cum_exec_qty")
  private BigDecimal cumExecQty = null;

  @SerializedName("cum_exec_value")
  private BigDecimal cumExecValue = null;

  @SerializedName("cum_exec_fee")
  private Double cumExecFee = null;

  @SerializedName("reject_reason")
  private String rejectReason = null;

  @SerializedName("order_link_id")
  private String orderLinkId = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public OrderRes orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderRes userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public OrderRes symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OrderRes side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public OrderRes orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public OrderRes price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrderRes qty(String qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public String getQty() {
    return qty;
  }

  public void setQty(String qty) {
    this.qty = qty;
  }

  public OrderRes timeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @ApiModelProperty(value = "")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  public OrderRes orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderRes lastExecTime(Double lastExecTime) {
    this.lastExecTime = lastExecTime;
    return this;
  }

   /**
   * Get lastExecTime
   * @return lastExecTime
  **/
  @ApiModelProperty(value = "")
  public Double getLastExecTime() {
    return lastExecTime;
  }

  public void setLastExecTime(Double lastExecTime) {
    this.lastExecTime = lastExecTime;
  }

  public OrderRes lastExecPrice(Double lastExecPrice) {
    this.lastExecPrice = lastExecPrice;
    return this;
  }

   /**
   * Get lastExecPrice
   * @return lastExecPrice
  **/
  @ApiModelProperty(value = "")
  public Double getLastExecPrice() {
    return lastExecPrice;
  }

  public void setLastExecPrice(Double lastExecPrice) {
    this.lastExecPrice = lastExecPrice;
  }

  public OrderRes leavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
    return this;
  }

   /**
   * Get leavesQty
   * @return leavesQty
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLeavesQty() {
    return leavesQty;
  }

  public void setLeavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
  }

  public OrderRes cumExecQty(BigDecimal cumExecQty) {
    this.cumExecQty = cumExecQty;
    return this;
  }

   /**
   * Get cumExecQty
   * @return cumExecQty
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumExecQty() {
    return cumExecQty;
  }

  public void setCumExecQty(BigDecimal cumExecQty) {
    this.cumExecQty = cumExecQty;
  }

  public OrderRes cumExecValue(BigDecimal cumExecValue) {
    this.cumExecValue = cumExecValue;
    return this;
  }

   /**
   * Get cumExecValue
   * @return cumExecValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumExecValue() {
    return cumExecValue;
  }

  public void setCumExecValue(BigDecimal cumExecValue) {
    this.cumExecValue = cumExecValue;
  }

  public OrderRes cumExecFee(Double cumExecFee) {
    this.cumExecFee = cumExecFee;
    return this;
  }

   /**
   * Get cumExecFee
   * @return cumExecFee
  **/
  @ApiModelProperty(value = "")
  public Double getCumExecFee() {
    return cumExecFee;
  }

  public void setCumExecFee(Double cumExecFee) {
    this.cumExecFee = cumExecFee;
  }

  public OrderRes rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * Get rejectReason
   * @return rejectReason
  **/
  @ApiModelProperty(value = "")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public OrderRes orderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
    return this;
  }

   /**
   * Get orderLinkId
   * @return orderLinkId
  **/
  @ApiModelProperty(value = "")
  public String getOrderLinkId() {
    return orderLinkId;
  }

  public void setOrderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
  }

  public OrderRes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public OrderRes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRes orderRes = (OrderRes) o;
    return Objects.equals(this.orderId, orderRes.orderId) &&
        Objects.equals(this.userId, orderRes.userId) &&
        Objects.equals(this.symbol, orderRes.symbol) &&
        Objects.equals(this.side, orderRes.side) &&
        Objects.equals(this.orderType, orderRes.orderType) &&
        Objects.equals(this.price, orderRes.price) &&
        Objects.equals(this.qty, orderRes.qty) &&
        Objects.equals(this.timeInForce, orderRes.timeInForce) &&
        Objects.equals(this.orderStatus, orderRes.orderStatus) &&
        Objects.equals(this.lastExecTime, orderRes.lastExecTime) &&
        Objects.equals(this.lastExecPrice, orderRes.lastExecPrice) &&
        Objects.equals(this.leavesQty, orderRes.leavesQty) &&
        Objects.equals(this.cumExecQty, orderRes.cumExecQty) &&
        Objects.equals(this.cumExecValue, orderRes.cumExecValue) &&
        Objects.equals(this.cumExecFee, orderRes.cumExecFee) &&
        Objects.equals(this.rejectReason, orderRes.rejectReason) &&
        Objects.equals(this.orderLinkId, orderRes.orderLinkId) &&
        Objects.equals(this.createdAt, orderRes.createdAt) &&
        Objects.equals(this.updatedAt, orderRes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userId, symbol, side, orderType, price, qty, timeInForce, orderStatus, lastExecTime, lastExecPrice, leavesQty, cumExecQty, cumExecValue, cumExecFee, rejectReason, orderLinkId, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRes {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    lastExecTime: ").append(toIndentedString(lastExecTime)).append("\n");
    sb.append("    lastExecPrice: ").append(toIndentedString(lastExecPrice)).append("\n");
    sb.append("    leavesQty: ").append(toIndentedString(leavesQty)).append("\n");
    sb.append("    cumExecQty: ").append(toIndentedString(cumExecQty)).append("\n");
    sb.append("    cumExecValue: ").append(toIndentedString(cumExecValue)).append("\n");
    sb.append("    cumExecFee: ").append(toIndentedString(cumExecFee)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    orderLinkId: ").append(toIndentedString(orderLinkId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

