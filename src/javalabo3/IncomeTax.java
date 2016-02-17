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
public class IncomeTax {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("enter your annual income");
        //take the input from the user and coverting it to pence
        long annualIncome = input.nextLong() * 100;
       
        if (annualIncome <= 1060000){
            System.out.println("you do not have to pay any tax");
        }
        else if ((annualIncome >1060000) && (annualIncome <= 4328500)){
            double tax = (double)(annualIncome - 1060000)*20/10000;
            System.out.println("your tax is bb= "+tax);
        }
        else if ((annualIncome >4328500) && (annualIncome <= 16060000)){
           double tax =  (double) (annualIncome - 1060000)* 40/10000;
            System.out.println("your tax is cc= "+tax);
        }
        else {
            double tax = (double)(annualIncome - 1060000)* 45/10000;
            System.out.println("your tax is = "+tax);
        }
    }
}
