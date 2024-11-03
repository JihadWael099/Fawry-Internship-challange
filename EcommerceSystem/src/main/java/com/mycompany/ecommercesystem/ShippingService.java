/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

import java.util.List;

/**
 *
 * @author gehad
 */
public class ShippingService {
    
    public void ShipItems(List<CartItems>items){
        double totalweight=0;
        double SumTotalWeight=0;
        int found=0;
        System.out.println("** Shipment notice **");
        for(CartItems item:items)
        {
            found=1;
            Product product=item.getProduct();
            if(product.isShipppable()&& product instanceof PerishableProduct )
            {
                double FinalTotalWight=((PerishableProduct) product).getWeight()*(item.getQuantity());
                totalweight+=FinalTotalWight;
                System.out.println(item.getQuantity()+"x "+product.getProductName()+"      "+FinalTotalWight+ " g");
            }
            else if(product.isShipppable()&& product instanceof NotPerishableProduct )
            {
                double FinalTotalWight=((NotPerishableProduct) product).getWeight()*Double.valueOf(item.getQuantity());
                totalweight += FinalTotalWight;
                System.out.println(item.getQuantity()+"x "+product.getProductName()+"      "+FinalTotalWight+ " g");
            }
            
            
        
        }
        if(found==1)
        {
            System.out.println("Total Package Weight  "+(totalweight/1000.0)+" Kg");
        }
        
        
    }
    
}
