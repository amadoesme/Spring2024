/* Names: Esmeralda Amado, Janelle Rivera
 * Course: CS2011
 * Section: 09 & 10
 * Description: We added if else statments to the code from lab 4
 * Other comments: N/A
 */

//this will import the scanner library
import java.util.Scanner;

public class PizzasAndPeopleWithInputValidation{
    public static void main (String[] args){
        Scanner scan  = new Scanner(System.in);
        
        // user input
        System.out.print("How many pizzas?");
        int totalPizzas = scan.nextInt();
        
        //code we changed using if else statements
        if (totalPizzas < 0){
            System.out.println("We cannot have a negative amount of pizzas");
            System.exit(0);
        }
        
        System.out.print("How many slices per pizza?");
        int slicesPerPizza = scan.nextInt();
        if(slicesPerPizza < 0){
            System.out.println("We cannot have any negative slices");
            System.exit(0);
        }
    
        System.out.print("How many people? ");
        int totalPeople = scan.nextInt();
        if(totalPeople<0){
           System.out.println("We cannot have any negative slices");
           System.exit(0);
        }
        
        // calculates the number of slices that remain after 
        // giving them to the number of people the user provided
        int numSlicesLeftover = (totalPizzas * 
        slicesPerPizza) % totalPeople;
        
        // final output
        System.out.println("If you split all this pizza among " 
                           + totalPeople + " people, you will have " 
                           + numSlicesLeftover + " slices left over...");

        
    }
}