/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author gehad
 */
public class NotPerishableProduct extends Product {
    
    private double weight;
    public NotPerishableProduct(String productName, double productPrice, int productCount,double weight) {
        super(productName, productPrice, productCount);
        this.weight=weight;
    }

    @Override
    public boolean isExpired() {
        return false;
        
    }

    @Override
    public boolean isShipppable() {
        return true;
    }

    public double getWeight() {
        return weight;
    }
        
    
}
