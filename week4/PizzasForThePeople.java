/* Names: Esmeralda Amado, Cesar Martinez
 * Course: CS2011
 * Section: 09 & 10
 * Description: We created a program that will give us the output 
    of the number whole pizzas that can be made and the left over 
    slices that didn't make it to the whole pizza while using user
    input.
 * Other comments: N/A
 */

//this will import the scanner library
import java.util.Scanner;

// we used the same code as the first program

public class PizzasForThePeople {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many pizzas? ");
        int totalPizzas = scan.nextInt();

        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = scan.nextInt();

        System.out.print("How many people? ");
        int totalPeople = scan.nextInt();

        int numSlicesLeftover = (totalPizzas * slicesPerPizza) % totalPeople;
        
        // new written program
        // numLeftover calculates the number of whole pizzas that can
        // be made with the numSlicesLeftover
        
        int numLeftover = numSlicesLeftover / slicesPerPizza;
        
        // numWholePizza calculates the number of slices that are left over
        // after making the whole pizzas
        
        int numWholePizza = numSlicesLeftover % slicesPerPizza;
        
        // informs the user the new output
        
        System.out.println("If you split all this pizza evenly among " + totalPeople
                           +" people, you will have " + numLeftover + " whole pizzas and " 
                           + numWholePizza + " slices left over.");
    }
}
