package com.shoppingCart.ShoppingCart.Controller;

import com.shoppingCart.ShoppingCart.Model.CartBill;
import com.shoppingCart.ShoppingCart.Model.CartInput;
import com.shoppingCart.ShoppingCart.Service.GenerateShoppingBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {
    @Autowired
    private GenerateShoppingBill generateShoppingBill;
    @PostMapping("/generate")
    public ResponseEntity<?> GenerateBill(@RequestBody CartInput cartInput)
    {
        CartBill cartBill = generateShoppingBill.generateBill(cartInput);
        if(cartBill != null){
            return new ResponseEntity<CartBill>(cartBill, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
