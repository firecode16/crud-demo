package com.company.crud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author FireCode16
 */
@Entity
@Table(name = "cart_prices")
public class Prices implements Serializable {

    @Id
    @Column(name = "cart_id")
    private String cartId;
    @Column(name = "total_price")
    private int totalPrice;
    @Column(name = "iva")
    private int iva;
    @Column(name = "promotion")
    private int promotion;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", referencedColumnName = "sku", insertable = false, updatable = false)
    private Cart cart;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}
