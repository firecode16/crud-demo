package com.company.crud.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FireCode16
 */
@Entity
@Table(name = "cart")
public class Cart implements Serializable {

    @Id
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "item_number")
    private int itemNumber;
    @Column(name = "store")
    private String store;
    @Column(name = "date_transac")
    private String dateTransac;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prices> arrPrices;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public String getDateTransac() {
        return dateTransac;
    }

    public void setDateTransac(String dateTransac) {
        this.dateTransac = dateTransac;
    }

    public List<Prices> getArrPrices() {
        return arrPrices;
    }

    public void setArrPrices(List<Prices> arrPrices) {
        this.arrPrices = arrPrices;
    }

}
