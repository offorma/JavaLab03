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
public class daysOfWeek {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number for the"
                + " days of the week ranging from 1-7");
        int weekDay = input.nextInt();
        switch (weekDay){
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                    System.out.println("Wednesday");
                    break;
            case 4:
                    System.out.println("Thursday");
                    break;
            case 5:
                    System.out.println("Friday");
                    break;
            case 6:
                    System.out.println("Saturday");
                    break;
            case 7:
                    System.out.println("Sunday");
                    break;                
        }
        
    }
}
