package com.smk.bi.ticketing.model;// Nama : Didin nur yahya

import javax.persistence.*;

// kelas : 16102087
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private Integer identifyNumber;
    private String customerAddres;
    private String customerEmail;
    private String costumerPhone;

    public Long getCustomerId() {

        return customerId;
    }

    public void setCustomerId(Long customerId) {

        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(Integer identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getCustomerAddres() {
        return customerAddres;
    }

    public void setCustomerAddres(String customerAddres) {
        this.customerAddres = customerAddres;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCostumerPhone() {
        return costumerPhone;
    }

    public void setCostumerPhone(String costumerPhone) {
        this.costumerPhone = costumerPhone;
    }

}
