/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommercesystem;

import java.util.Date;

/**
 *
 * @author gehad
 */


public class EcommerceSystem {
    public static void Checkout(Customer customer, Cart cart) {
        double subtotal = cart.CalculateSubTotal();
        double shippingFees = cart.CalculateShippingFees();
        double totalAmount = subtotal + shippingFees;

        if (customer.getBalance() < totalAmount) {
            System.out.println("You don,t have enough mony to containue the shopping ");
            return;
        }
        else if(cart.CartSize()==0){
            System.out.println("You don,t have items in your cart please add first");
             return;
        }
        else
        {
        customer.SubstructAmount(totalAmount);
        }

     
        ShippingService shippingService = new ShippingService();
        shippingService.ShipItems(cart.getItems());

        System.out.println("\n** Checkout receipt **");
        for (CartItems item : cart.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct().getProductName() + " " +
                    (item.getProduct().getProductPrice() * item.getQuantity()));
        }
        System.out.println("-".repeat(20));
        System.out.println("Subtotal     " + subtotal);
        System.out.println("Shipping     " + shippingFees);
        System.out.println("Amount       " + totalAmount);
    }
    
    
    public static void main(String[] args) {
        NotPerishableProduct tv=new NotPerishableProduct("TV",20000,5,5000);
        PerishableProduct cheese=new PerishableProduct("cheese",244,5,new Date(System.currentTimeMillis()+86400000),100);
        NotShippableProduct card=new NotShippableProduct("vodafone card", 100,10 );
        
        
        Cart cart=new Cart();
        Customer customer=new Customer(200000);
        
        cart.AddProduct(cheese,3);
        cart.AddProduct(tv,1);
        cart.AddProduct(card,1);
        Checkout(customer,cart);
        
       
        
        System.out.println("Your Balance is "+customer.getBalance());
        
        
        
    }
}
