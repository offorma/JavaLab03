/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabo3;
import javax.swing.*;
/**
 *
 * @author offormachukwunonso
 */
public class Menu {
     public static void main(String[] args) {
        // TODO code application logic here
        int itemPrice = 0;
        String itemName ="";
      String input = JOptionPane.showInputDialog("A \t Chocolate \t [75p] \n"+
              "B \t Toffee \t [60p] \n"+"C \t Cookie \t [90p] \n");
      char mainInput = input.charAt(0);
      
       int inputAmount = Integer.parseInt(
            JOptionPane.showInputDialog("how amany items do you require ")
       );
      
      
      if(mainInput == 'A'|| mainInput == 'a'|| mainInput == 'B'|| mainInput =='b'||
              mainInput == 'C'|| mainInput =='c'){
          
                switch (mainInput){
                    case 'A':
                        itemPrice = 75;
                        itemName = "Chocolate"; 
                        break;
                    case 'a':
                        itemPrice = 75;
                        itemName = "Chocolate";
                        break;
                    case 'B':
                        itemPrice = 60;
                        itemName = "Toffee";
                        break;
                    case 'b':
                        itemPrice =60;
                        itemName = "Toffee";
                        break;
                    case 'C':
                        itemPrice = 90;
                        itemName = "Cookie";
                        break;
                    case 'c':
                        itemPrice = 90;
                        itemName = "Cookie";
                        break;
                }
  
        }
      else{
      JOptionPane.showMessageDialog(null,"Wrong input option");
      }
      int itemSum = itemPrice * inputAmount;
     JOptionPane.showMessageDialog(null,"Your oder is for "
             +inputAmount+" "+itemName+" and will cost "+itemSum+"P");
    }
}
     
