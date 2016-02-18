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
public class NumberToWords {
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number between 20 and 99");
        int number = input.nextInt();
        
        int tens=number/10, units = number%10;
       
        String tensInWord = ""; 
        
        String unitsInWord = "";
       
        switch(tens){
            case 2:
                tensInWord = "Twenty";
                switch(units){
                    case 1:
                          unitsInWord = "One";
                           break;
                    case 2:
                        unitsInWord = "Two";
                         break;
                    case 3:
                        unitsInWord = "Three";
                         break;
                    case 4:
                        unitsInWord= "Four"; 
                         break;
                    case 5:
                        unitsInWord = "Five";
                         break;
                    case 6:
                        unitsInWord = "Six";
                         break;
                    case 7:
                        unitsInWord = "Seven";
                         break;
                    case 8:
                        unitsInWord = "Eight"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                   }
                break;
            case 3:
                tensInWord = "Thirty";
                switch(units){
                    case 1:
                          unitsInWord = "One";
                           break;
                    case 2:
                        unitsInWord = "Two";
                         break;
                    case 3:
                        unitsInWord = "Three";
                         break;
                    case 4:
                        unitsInWord= "Four"; 
                         break;
                    case 5:
                        unitsInWord = "Five";
                         break;
                    case 6:
                        unitsInWord = "Six";
                         break;
                    case 7:
                        unitsInWord = "Seven";
                         break;
                    case 8:
                        unitsInWord = "Eight"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                        }
                 break;
            case 4:
                tensInWord = "Forty"; 
                switch(units){
                    case 1:
                          unitsInWord = "One";
                           break;
                    case 2:
                        unitsInWord = "Two";
                         break;
                    case 3:
                        unitsInWord = "Three";
                         break;
                    case 4:
                        unitsInWord= "Four"; 
                         break;
                    case 5:
                        unitsInWord = "Five";
                         break;
                    case 6:
                        unitsInWord = "Six";
                         break;
                    case 7:
                        unitsInWord = "Seven";
                         break;
                    case 8:
                        unitsInWord = "Eight"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                        }
                 break;
            case 5:
                tensInWord = "Fifty";
                switch(units){
                    case 1:
                          unitsInWord = "One";
                           break;
                    case 2:
                        unitsInWord = "Two";
                         break;
                    case 3:
                        unitsInWord = "Three";
                         break;
                    case 4:
                        unitsInWord= "Four"; 
                         break;
                    case 5:
                        unitsInWord = "Five";
                         break;
                    case 6:
                        unitsInWord = "Six";
                         break;
                    case 7:
                        unitsInWord = "Seven";
                         break;
                    case 8:
                        unitsInWord = "Eight"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                        }
                 break;
            case 6:
                tensInWord = "Sixty";
                    switch(units){
                        case 1:
                          unitsInWord = "One";
                           break;
                        case 2:
                            unitsInWord = "Two";
                             break;
                        case 3:
                            unitsInWord = "Three";
                             break;
                        case 4:
                            unitsInWord= "Four"; 
                             break;
                        case 5:
                            unitsInWord = "Five";
                             break;
                        case 6:
                            unitsInWord = "Six";
                             break;
                        case 7:
                            unitsInWord = "Seven";
                             break;
                        case 8:
                            unitsInWord = "Eight"; 
                             break;
                        case 9:
                            unitsInWord = "Nine"; 
                             break;
                            }
                break;
            case 7:
                tensInWord = "Seventy";
                switch(units){
                    case 1:
                          unitsInWord = "One";
                           break;
                    case 2:
                        unitsInWord = "Two";
                         break;
                    case 3:
                        unitsInWord = "Three";
                         break;
                    case 4:
                        unitsInWord= "Four"; 
                         break;
                    case 5:
                        unitsInWord = "Five";
                         break;
                    case 6:
                        unitsInWord = "Six";
                         break;
                    case 7:
                        unitsInWord = "Seven";
                         break;
                    case 8:
                        unitsInWord = "Eight"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                        }
                 break;
            case 8:
                tensInWord = "Eighty";
                switch(units){
                    case 1:
                        unitsInWord = "One";
                        break;
                    case 2:
                        unitsInWord = "Two";
                         break;
                    case 3:
                        unitsInWord = "Three";
                         break;
                    case 4:
                        unitsInWord= "Four"; 
                         break;
                    case 5:
                        unitsInWord = "Five";
                         break;
                    case 6:
                        unitsInWord = "Six";
                         break;
                    case 7:
                        unitsInWord = "Seven";
                         break;
                    case 8:
                        unitsInWord = "Eight"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                }
                 break;
            case 9:
                tensInWord = "Ninety"; 
                    switch(units){
                      case 1:
                          unitsInWord = "One";
                           break;
                      case 2:
                          unitsInWord = "Two";
                           break;
                      case 3:
                          unitsInWord = "Three";
                           break;
                      case 4:
                          unitsInWord= "Four"; 
                           break;
                      case 5:
                          unitsInWord = "Five";
                           break;
                      case 6:
                          unitsInWord = "Six";
                           break;
                      case 7:
                          unitsInWord = "Seven";
                           break;
                      case 8:
                          unitsInWord = "Eight"; 
                           break;
                      case 9:
                          unitsInWord = "Nine"; 
                           break;
                          }
                 break;
            }  
        
        System.out.println(tensInWord + unitsInWord);
        
    }
}
