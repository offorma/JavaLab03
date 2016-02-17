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
public class LeapYear {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
  
        System.out.println("please enter a year");
        int year = input.nextInt();
        
        if (year % 4 == 0){
            if (year %100 != 0){
                System.out.println("Year "+year+" is a leap year");
            }
        }
        else {
             System.out.println("Year "+year+" is not a leap year");     
        }
        //using condition B
       
        if ((year % 4 == 0)&&(year %100 != 0) || (year % 400 == 0)){
            System.out.println("Year "+year+" is a leap year");
        }
        
        else {
             System.out.println("Year "+year+" is not a leap year");     
        }
     }
    
}
