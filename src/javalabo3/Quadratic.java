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
public class Quadratic {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number A");
        double a = input.nextDouble();
         System.out.println("please enter a number B ");
        double b = input.nextDouble();
         System.out.println("please enter a number C");
        double c = input.nextDouble();
        double d = (b*b)-(4*a*c);
        if (d<0){
        System.out.println("The quadratic equation does not have any solution");
        }
        else if (d == 0){
            double x = -(b/2*a);
            System.out.println("The quadratic equation has one solution x ="+x);
        }
        else{
            double x1 = -b + Math.sqrt(d)/2*a;
            double x2 = -b - Math.sqrt(d)/2*a;
            System.out.println("The quadratic equation has "
                    + "two solution X1 = "+x1+" and X2 = "+x2);
        }  
    }    
}
