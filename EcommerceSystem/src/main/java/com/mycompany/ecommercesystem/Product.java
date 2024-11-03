/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author gehad
 */
public abstract class Product {
    private String productName;
    private double productPrice;
    private int productCount;

    public Product(String productName, double productPrice, int productCount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
    
    public abstract boolean isExpired();
    public abstract boolean isShipppable();
    
    
}
