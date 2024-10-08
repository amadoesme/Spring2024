/* Names: Esmeralda Amado, Cesar Martinez
 * Course: CS2011
 * Section: 09 & 10
 * Description: We created a program that will give us the output 
    of the number of slices that will be left over if the pizzas 
    are distributed correctly, while using user input.
 * Other comments: N/A
 */

//this will import the scanner library
import java.util.Scanner;

public class PizzasAndPeople{
    public static void main (String[] args){
        Scanner scan  = new Scanner(System.in);
        
        // user input
        System.out.print("How many pizzas?");
        int totalPizzas = scan.nextInt();
        
        System.out.print("How many slices per pizza?");
        int slicesPerPizza = scan.nextInt();
    
        System.out.print("How many people? ");
        int totalPeople = scan.nextInt();
        
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