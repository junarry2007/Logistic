package com.logistic.dto;

import java.util.Date;

public class MovemenDto {
    private Integer productTypeId;
    private Integer portId;
    private Integer storeId;
    private Integer quantity;
    private Date deliveryDate;
    private Double shippingPrice;
    private String vehicleId;
    private String fleetNumber;
    private Integer processType;
    private String clientName;
    private String clientIdentification;
    private String guideNumber;
    
    public MovemenDto() { }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Integer getPortId() {
        return portId;
    }

    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getFleetNumber() {
        return fleetNumber;
    }

    public void setFleetNumber(String fleetNumber) {
        this.fleetNumber = fleetNumber;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientIdentification() {
        return clientIdentification;
    }

    public void setClientIdentification(String clientIdentification) {
        this.clientIdentification = clientIdentification;
    }

    public String getGuideNumber() {
        return guideNumber;
    }

    public void setGuideNumber(String guideNumber) {
        this.guideNumber = guideNumber;
    }

    // public Double getShippingPriceDiscount() {
    //     return shippingPriceDiscount;
    // }

    // public void setShippingPriceDiscount(Double shippingPriceDiscount) {
    //     this.shippingPriceDiscount = shippingPriceDiscount;
    // }

    // public Double getDiscountRate() {
    //     return discountRate;
    // }

    // public void setDiscountRate(Double discountRate) {
    //     this.discountRate = discountRate;
    // }
   
}