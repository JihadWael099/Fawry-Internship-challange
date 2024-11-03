/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author gehad
 */
public class NotShippableProduct extends Product{

    public NotShippableProduct(String productName, double productPrice, int productCount) {
        super(productName, productPrice, productCount);
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean isShipppable() {
        return false;
    }
    
}
