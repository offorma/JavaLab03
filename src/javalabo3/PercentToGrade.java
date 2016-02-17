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
public class PercentToGrade {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a Grade from 0-100");
        int grade = input.nextInt();
        
        if (grade > 70){
            System.out.println("A");
        }
        else if ((grade < 70) && (grade >= 60 )){
            System.out.println("B");
        }
        else if ((grade < 60) && (grade >= 50 )){
            System.out.println("C");
        }
        else if ((grade < 50) && (grade >= 40 )){
            System.out.println("D");
        }
        else if ((grade < 40) && (grade >= 35 )){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
         
        
    }
}
