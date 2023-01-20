package com.company.crud.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author FireCode16
 */
@Entity
@Table(name = "order_info")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "sku")
    private String sku;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "contact_phone")
    private String contactPhone;
    @Column(name = "item_number")
    private int itemNumber;
    @Column(name = "store")
    private String store;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

}
