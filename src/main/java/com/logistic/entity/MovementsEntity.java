package com.logistic.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "movements")                  
public class MovementsEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductsTypeEntity ProductTypeId;

    @ManyToOne
    @JoinColumn(name = "port_id")
    private PortEntity PortId;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private StoreEntity Store;

    @Column(name = "product_quantity")
    private Integer ProductQuantity;

    @Column(name = "registration_date")
    private Date RegistrationDate;

    @Column(name = "delivery_date")
    private Date DeliveryDate;

    @Column(name = "shipping_price")
    private BigDecimal ShippingPrice;

    @Column(name = "vehicle_id")
    private String VehicleId;

    @Column(name = "fleet_number")
    private String FleetNumber;

    @Column(name = "process_type")
    private Integer ProcessType;

    @Column(name = "client_name")
    private String ClientName;

    @Column(name = "client_identification")
    private String ClientIdentification;

    @Column(name = "guide_numer")
    private String GuideNumber;

    @Column(name = "shipping_price_discount")
    private BigDecimal ShippingPriceDiscount;

    @Column(name = "discount_rate")
    private BigDecimal DiscountRate;

    @Column(name = "shipping_total")
    private BigDecimal ShippingTotal;

    public MovementsEntity(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public ProductsTypeEntity getProductTypeId() {
        return ProductTypeId;
    }

    public void setProductTypeId(ProductsTypeEntity productTypeId) {
        ProductTypeId = productTypeId;
    }

    public PortEntity getPortId() {
        return PortId;
    }

    public void setPortId(PortEntity portId) {
        PortId = portId;
    }

    public StoreEntity getStore() {
        return Store;
    }

    public void setStore(StoreEntity store) {
        Store = store;
    }

    public Integer getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        ProductQuantity = productQuantity;
    }

    public Date getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        RegistrationDate = registrationDate;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public BigDecimal getShippingPrice() {
        return ShippingPrice;
    }

    public void setShippingPrice(BigDecimal shippingPrice) {
        ShippingPrice = shippingPrice;
    }

    public String getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(String vehicleId) {
        VehicleId = vehicleId;
    }

    public String getFleetNumber() {
        return FleetNumber;
    }

    public void setFleetNumber(String fleetNumber) {
        FleetNumber = fleetNumber;
    }

    public Integer getProcessType() {
        return ProcessType;
    }

    public void setProcessType(Integer processType) {
        ProcessType = processType;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getClientIdentification() {
        return ClientIdentification;
    }

    public void setClientIdentification(String clientIdentification) {
        ClientIdentification = clientIdentification;
    }

    public String getGuideNumber() {
        return GuideNumber;
    }

    public void setGuideNumber(String guideNumber) {
        GuideNumber = guideNumber;
    }

    public BigDecimal getShippingPriceDiscount() {
        return ShippingPriceDiscount;
    }

    public void setShippingPriceDiscount(BigDecimal shippingPriceDiscount) {
        ShippingPriceDiscount = shippingPriceDiscount; 
    }

    public BigDecimal getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        DiscountRate = discountRate;
    }

    public BigDecimal getShippingTotal() {
        return ShippingTotal;
    }

    public void setShippingTotal(BigDecimal shippingTotal) {
        ShippingTotal = shippingTotal;
    }
  
}