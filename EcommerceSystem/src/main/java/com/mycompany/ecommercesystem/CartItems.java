/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author gehad
 */
public class CartItems {
    
    private Product product;
    private int quantity;

    public CartItems(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    
}
