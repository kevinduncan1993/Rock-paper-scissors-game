//Kevin Finnissee
//Date: 11/07/21
//Assignment 3

package module3assignment;

import java.util.Scanner;


public class Module3assignment {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner object
        Scanner input = new Scanner(System.in);
        
        //Generates random number from 0 - 3
        int number_1 = (int)(Math.random() * 4);
        
    //Prompts user to Enter an integer between 1 -3 
     System.out.println("1 = Rock, 2 = Paper, 3 = Scissors ");
    System.out.println("Enter a number between 1 - 3: ");
   
    int number = input.nextInt();
    //Displays computer generated number
    System.out.println("Computer selection  " + number_1);
    
   //Tests for conditions of game if user wins, loses, or gets a draw
    if(number_1 == 1){
        System.out.println("Rock ");  
    }
    else if(number_1 == 2 ){
        System.out.println("Paper ");
    }
    
    else if(number_1 == 3){
        System.out.println("Scissors ");
    }
    //Displays user input 
    System.out.println("User selection " + number);
    
    if(number == 1){
        System.out.println("Rock");
    }
    
    else if(number == 2){
        System.out.println("Paper ");
    }
    
     else if(number == 3){
        System.out.println("Scissors ");
    }
    if (number_1 == number){
        System.out.println("Results : Draw ");
    }
    else if(number_1 == number){
        System.out.println("Results: Draw ");
    }
    else if(number_1 == number){
        System.out.println("Results: Draw ");
}
    else if(number_1 == 1 && number == 3){
        System.out.println("Results: You Lose ! ");
    }
    else if(number_1 == 3 && number == 2){
        System.out.println("Results: You Lose ! ");
}
    else if(number_1 == 2 && number == 1){
        System.out.println("Results: You Lose ! ");     
    }
   
    else if(number_1 == 3 && number == 1){
        System.out.println("Results: You Win ! ");
}
   else if(number_1 == 2 && number == 3){
        System.out.println("Results: You Win ! ");
} 
    
     else if(number_1 == 1 && number == 2){
        System.out.println("Results: You Win ! ");
}
     else if(number == 5){
         System.out.println("Quit program ");
     }
}
}