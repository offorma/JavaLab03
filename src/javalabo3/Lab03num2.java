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
public class Lab03num2 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number1 = input.nextInt();
        System.out.println("please enter a number");
        int number2 = input.nextInt();
        
        if ((number1 > 0) && (number2 > 0)){
            System.out.println(" Both Positive ");
        }
       if ((number1 < 0) && (number2 < 0)){
            System.out.println(" Both Negative ");
        }
        if (((number1 > 0) && (number2 < 0))||((number1 > 0) && (number2 < 0)) ){
            System.out.println(" Opposite Sign ");
        }
     }
}
