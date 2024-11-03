/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

/**
 *
 * @author gehad
 */
public class Customer {
    
    private double balance;

    public Customer(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void SubstructAmount(double amount){
        balance-=amount;
    }
    
}
