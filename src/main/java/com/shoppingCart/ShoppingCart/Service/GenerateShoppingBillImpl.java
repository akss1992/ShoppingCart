package com.shoppingCart.ShoppingCart.Service;

import com.shoppingCart.ShoppingCart.Model.CartBill;
import com.shoppingCart.ShoppingCart.Model.CartInput;
import org.springframework.stereotype.Component;

import java.sql.Array;

@Component
public class GenerateShoppingBillImpl implements GenerateShoppingBill{
    @Override
    public CartBill generateBill(CartInput cartInput) {
        final double soupPrice = 0.65;
        final double applePrice = 1.00;
        final double milkPrice = 1.30;
        final double breadPrice = 0.80;
        double subTotal = 0.00;
        double total = 0.00;
        double appleDiscount = 0.00;
        double breadDiscount = 0.00;
        int count = 0;
        String[] offer = new String[2];
        CartBill cartBill = new CartBill();
        if(cartInput != null)
        {



            subTotal = (cartInput.getAppleQuantity() * applePrice) +
                    (cartInput.getMilkQuantity() * milkPrice) +
                    (cartInput.getBreadQuantity() * breadPrice) +
                    (cartInput.getSoupQuantity() * soupPrice);

            if(cartInput.getAppleQuantity() > 0){
                appleDiscount = (cartInput.getAppleQuantity() * applePrice) * 0.1;
                offer[count] = "Apple 10% discount: " + Math.round(appleDiscount * 100.0) / 100.0 + "$";
                count++;
            }


            if(cartInput.getSoupQuantity() == 1)
            {

            }
            else if (cartInput.getBreadQuantity() > 0 && (cartInput.getSoupQuantity()/2 ==  cartInput.getBreadQuantity()))
            {
                breadDiscount = cartInput.getBreadQuantity() * breadPrice * 0.50;
                offer[count] = "Bread 50% discount on 2 tins: " + Math.round(breadDiscount * 100.0) / 100.0 + "$";
            }
            else if(cartInput.getBreadQuantity() > 0 && cartInput.getBreadQuantity() > cartInput.getSoupQuantity()/2)
            {
                breadDiscount = (cartInput.getSoupQuantity()/2) * breadPrice * 0.50;
                offer[count] = "Bread 50% discount on 2 tins: " + breadDiscount + "$";
            }
            else if(cartInput.getBreadQuantity() > 0 && cartInput.getBreadQuantity() < cartInput.getSoupQuantity()/2)
            {
                breadDiscount = cartInput.getBreadQuantity() * breadPrice * 0.50;
                offer[count] = "Bread 50% discount on 2 tins: " + breadDiscount + "$";
            }

            total = subTotal - appleDiscount - breadDiscount;

            cartBill.setSubTotal(subTotal);
            cartBill.setTotal(total);
            cartBill.setOffers(offer);
        }
        return cartBill;
    }
}
