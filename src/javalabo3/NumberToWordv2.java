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
public class NumberToWordv2 {
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number between 0 and 99");
        int number = input.nextInt();
        
        int tens=number/10, units = number%10;
       
        String tensInWord = ""; 
        
        String unitsInWord = "";
        
        if((number<=99) && (number>=0)){
            switch(tens){
                case 0:
                tensInWord = "";
                switch(units){
                    case 0:
                        unitsInWord = "Zero";
                           break;
                    case 1:
                          unitsInWord = "one";
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
                        unitsInWord = "Eigh"; 
                         break;
                    case 9:
                        unitsInWord = "Nine"; 
                         break;
                   }
                break;
        
                case 1:
                tensInWord = "";
                switch(units){
                    case 0:
                        unitsInWord = "Ten";
                           break;
                    case 1:
                          unitsInWord = "Eleven";
                           break;
                    case 2:
                        unitsInWord = "Twelve";
                         break;
                    case 3:
                        unitsInWord = "Thirteen";
                         break;
                    case 4:
                        unitsInWord= "Fourteen"; 
                         break;
                    case 5:
                        unitsInWord = "Fifteen";
                         break;
                    case 6:
                        unitsInWord = "Sixteen";
                         break;
                    case 7:
                        unitsInWord = "Seventeen";
                         break;
                    case 8:
                        unitsInWord = "Eighteen"; 
                         break;
                    case 9:
                        unitsInWord = "Nineteen"; 
                         break;
                   }
                break;
            case 2:
                tensInWord = "Twenty";
                switch(units){
                    case 0:
                         unitsInWord = "";
                           break;
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
                    case 0:
                         unitsInWord = "";
                           break;
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
                    case 0:
                         unitsInWord = "";
                           break;
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
                    case 0:
                         unitsInWord = "";
                           break;
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
                        case 0:
                         unitsInWord = "";
                           break;
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
                    case 0:
                         unitsInWord = "";
                           break;
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
                    case 0:
                         unitsInWord = "";
                           break;
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
                        case 0:
                         unitsInWord = "";
                           break;
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
        }
        else{
        System.out.println("Your number input is not within range");
        }
        
        System.out.println(tensInWord + unitsInWord);
        
    }
}