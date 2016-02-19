/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabo3;
import java.util.*;
/**
 *
 * @author offormachukwunonso
 */
public class LargestMiddleSmallest {
     public static void main(String[] args) {
        // TODO code application logic here
        int largest = 0;
        int middle = 0;
        int smallest = 0;
        Scanner input = new Scanner(System.in);
         System.out.println("please enter a number A");
         int num1 = input.nextInt();
         System.out.println("please enter a number A");
          int num2 = input.nextInt();
         System.out.println("please enter a number A");
          int num3 = input.nextInt();
          
        if ((num1>num3)&&(num3>num2)){
            largest = num1;
            middle = num3;
            smallest = num2;
            System.out.println(largest+" "+middle+" "+smallest);
        }
        else if((num1>num2) && (num2>num3)){
             largest = num1;
            middle = num2;
            smallest = num3;
            System.out.println(largest+" "+middle+" "+smallest);
        
        }
        else if((num3>num2) && (num2>num1)){
            largest = num3;
            middle = num2;
            smallest = num1;
            System.out.println(largest+" "+middle+" "+smallest);
        }
        else if((num3>num1) && (num1>num2)){
             largest = num3;
            middle = num1;
            smallest = num2;
            System.out.println(largest+" "+middle+" "+smallest);
        
        }
        else if((num2>num3) && (num3>num1)){
            largest = num2;
            middle = num3;
            smallest = num1;
            System.out.println(largest+" "+middle+" "+smallest);
        }
        else{
                largest = num2;
            middle = num1;
            smallest = num3;
            System.out.println(largest+" "+middle+" "+smallest);
        }
     }
}
