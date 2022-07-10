package com.shoppingCart.ShoppingCart.Service;

import com.shoppingCart.ShoppingCart.Model.CartBill;
import com.shoppingCart.ShoppingCart.Model.CartInput;
import org.springframework.stereotype.Service;

@Service
public interface GenerateShoppingBill {
    public CartBill generateBill(CartInput cartInput);
}
