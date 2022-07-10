package com.shoppingCart.ShoppingCart.Model;

import java.util.Arrays;

public class CartBill {

    private double subTotal;
    private String[] offers;
    private double total;

    public CartBill() {
    }

    public CartBill(double subTotal, String[] offers, double total) {
        this.subTotal = subTotal;
        this.offers = offers;
        this.total = total;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String[] getOffers() {
        return offers;
    }

    public void setOffers(String[] offers) {
        this.offers = offers;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CartBill{" +
                "subTotal=" + subTotal +
                ", offers=" + Arrays.toString(offers) +
                ", total=" + total +
                '}';
    }
}
