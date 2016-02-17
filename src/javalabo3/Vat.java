/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabo3;

import java.util.Scanner;

/**
 *
 * @author offormachukwunonso
 */
public class Vat {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
  
        System.out.println("please enter cost per item");
        Double cost = input.nextDouble();
        System.out.println("please enter number of items u want");
        int number = input.nextInt();
        System.out.println("Does the product have a VAT");
        String myInput = input.next();
        char vat = myInput.charAt(0);
        
        if (vat == 'y'){
            double costOfOrder = cost * number * 1.2;
            System.out.println("cost ot the order ="+ costOfOrder);  
        }
        else{
            double costOfOrder = cost * number;
            System.out.println("cost ot the order ="+ costOfOrder); 
        }
        
      }
    
}
