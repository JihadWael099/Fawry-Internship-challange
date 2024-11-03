/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gehad
 */
public class Cart {
   private List<CartItems>items;
   
   public Cart(){
       items=new ArrayList<>();
   }
   
   public double CalculateSubTotal(){
       double TotalPrice=0;
       for(CartItems item:items)
       {
           Product product =item.getProduct();
           if(product.isShipppable()&& product instanceof PerishableProduct)
           {
               TotalPrice+=((PerishableProduct) product).getProductPrice()*item.getQuantity();
           }
           if(product.isShipppable()&& product instanceof NotPerishableProduct)
           {
               TotalPrice+=((NotPerishableProduct) product).getProductPrice()*item.getQuantity();
               
           }
       }
       
       return TotalPrice;
   }
   public void AddProduct(Product product, int quantity ){
       
       if(product.getProductCount()<quantity){
           System.out.println("Sorry there is not enough stock for"+" "+product.getProductName());
       }
       else if(product.isExpired()){
           System.out.println("Product"+product.getProductName()+"is expired");
       }
       else{
           items.add(new CartItems(product,quantity));
           int cartQ=product.getProductCount()-quantity;
           product.setProductCount(cartQ);
       }
       
   }
   public double CalculateShippingFees(){
      double TotalQuantity=0;
       for(CartItems item:items)
       {
           TotalQuantity+=item.getQuantity();
          
       }
       
       return  TotalQuantity*10;
   }
   public int CartSize(){
       
      return items.size();
   }
   public List<CartItems>getItems(){
       return items;
   }
}
