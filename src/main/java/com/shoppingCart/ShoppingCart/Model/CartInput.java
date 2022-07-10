package com.shoppingCart.ShoppingCart.Model;

import java.util.Arrays;

public class CartInput {
    private int soupQuantity;
    private int breadQuantity;
    private int milkQuantity;
    private int appleQuantity;

    public CartInput() {
    }

    public CartInput(int soupQuantity, int breadQuantity, int milkQuantity, int appleQuantity) {
        this.soupQuantity = soupQuantity;
        this.breadQuantity = breadQuantity;
        this.milkQuantity = milkQuantity;
        this.appleQuantity = appleQuantity;
    }

    public int getSoupQuantity() {
        return soupQuantity;
    }

    public void setSoupQuantity(int soupQuantity) {
        this.soupQuantity = soupQuantity;
    }

    public int getBreadQuantity() {
        return breadQuantity;
    }

    public void setBreadQuantity(int breadQuantity) {
        this.breadQuantity = breadQuantity;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public int getAppleQuantity() {
        return appleQuantity;
    }

    public void setAppleQuantity(int appleQuantity) {
        this.appleQuantity = appleQuantity;
    }

    @Override
    public String toString() {
        return "CartInput{" +
                "soupQuantity=" + soupQuantity +
                ", breadQuantity=" + breadQuantity +
                ", milkQuantity=" + milkQuantity +
                ", appleQuantity=" + appleQuantity +
                '}';
    }
}
