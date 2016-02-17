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
public class GenderAndAge {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your Gender");
        String myInput = input.next();
        char gender = myInput.charAt(0);
        System.out.println("please enter your age");
        int age = input.nextInt();
        if ((gender == 'M')||(gender == 'm') && (age < 18)){
            System.out.println("you are a boy");
        }
        else if ((gender == 'M')||(gender == 'm') && (age >= 18)){
            System.out.println("you are a man");
        }
        else if ((gender == 'F')||(gender == 'f') && (age >= 18)){
            System.out.println("you are a woman");
        }
        else {
            System.out.println("you are a girl");
        }
     }
}
