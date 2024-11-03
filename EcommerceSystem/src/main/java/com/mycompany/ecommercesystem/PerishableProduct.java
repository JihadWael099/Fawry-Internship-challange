/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

import java.util.Date;

/**
 *
 * @author gehad
 */
public class PerishableProduct extends Product{
    
    private Date expirDate;
    private double weight;
    public PerishableProduct(String productName, double productPrice, int productCount,Date expirDate,double weight) {
        super(productName, productPrice, productCount);
        this.expirDate=expirDate;
        this.weight=weight;
    }

    public Date getExpirDate() {
        return expirDate;
    }
    

    @Override
    public boolean isExpired() {
       Date currentDate=new Date();
       if(currentDate.after(expirDate))return true;
       else return false;
        
    }

    @Override
    public boolean isShipppable() {
        return true;
    }

    public double getWeight() {
        return weight;
    }
    
    
}
