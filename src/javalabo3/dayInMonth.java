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
public class dayInMonth {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number for the"
                + " months of the year ranging from 1-12");
        int weekDay = input.nextInt();
        System.out.println("Is this year a leap year?");
        char leap = input.next().charAt(0);
        switch (weekDay){
            case 1:
                    System.out.println("January has 31 days");
                    break;
            case 2:
                    if (leap == 'y'){
                    System.out.println("Febuary has 29 days");
                    }
                    else {
                        System.out.println("Febuary has 28 days");
                    }
                    break;
            case 3:
                    System.out.println("March has 31 days");
                    break;
            case 4:
                    System.out.println("April has 30 days");
                    break;
            case 5:
                    System.out.println("May has 31 days");
                    break;
            case 6:
                    System.out.println("June has 30 days");
                    break;
            case 7:
                    System.out.println("July has 31 days");
                    break; 
            case 8:
                    System.out.println("August has 31 days");
                    break;
            case 9:
                    System.out.println("September has 30 days");
                    break;
            case 10:
                    System.out.println("October has 31 days");
                    break;
            case 11:
                    System.out.println("November has 30 days");
                    break;
            case 12:
                    System.out.println("December has 31 days");
                    break;
        }
        
    }
}
