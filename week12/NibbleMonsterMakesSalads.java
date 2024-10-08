/* Names: Esmeralda Amado
 * Course: CS2011
 * Section: 09 & 10
 * Description: Nibble monster ask's how many
 snacks the user has. Once it reaches to three
 snacks it serves the user a salad and tells
 them how many monster made. The program continues
 till the loop ends.
 * Other comments: It took me a long time to 
 undertand the hints and what exactly i had to do.
 I'm no longer sure if my code looks messy or not.
 */

import java.util.Scanner;

public class NibbleMonsterMakesSalads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //the user inputs the number of snacks for the monster
        System.out.print("How many snacks do you have for the nibble monster: ");
        int snacks = input.nextInt();
        System.out.println("If they are all nibbles I'll make 1 salad for us :D");

        //i made these counters cause that's what i understood from the hint
        int collectedNibbles = 0; //number of nibbles collected
        int nibbleSalads = 0; //number of salads made
        
        //string hint for bowl
        String salad = "";

        //after the user tells the monster the number of snacks,
        //the monster asks for them to start feeding him
        for (int numSnacks = snacks; numSnacks > 0; numSnacks--) {
            System.out.println("Monster hungry :E");
            System.out.print("Feed monster a nibble :o ");
            char myNib = input.next().charAt(0);

            //options so the user can feed the monster to make salad
            if (myNib >= '0' && myNib <= '9') {
                System.out.println("Nibble monster likes!");
                collectedNibbles++; //increments the nibble counter hint
                salad += myNib; //adds nibble to salad hint
            } 
            else if (myNib >= 'A' && myNib <= 'F') {
                System.out.println("Delish!");
                collectedNibbles++; //increments the nibble counter hint
                salad += myNib; //adds nibble to salad hint
            } 
            else if (myNib >= 'a' && myNib <= 'f') {
                System.out.println("Yummeh!");
                collectedNibbles++; //increments the nibble counter hint
                salad += myNib; //adds nibble to salad hint
            } 
            else {
                System.out.println("NO!");
            }
            
            //i tried using a for loop for this but the loop kept breaking,
            //that's why i used another if statement inside the for loop,
            //cause IF the monster collects 3 nibbles he makes a salad
            
            //monster makes salads after recieving 3 nibbles not snacks
            if (collectedNibbles == 3) {
                System.out.println("<3 <3 <3 S A L A D  T I M E  <3 <3 <3");
                System.out.println("             " + salad + "             ");
                System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
                
                nibbleSalads++; //increment the salads counter, also from hint
                collectedNibbles = 0; //reseting the nibble counter for the next salad
                salad = ""; //making the bowl empty for next salad hint
                //monster lets the loop continue until done
            }
        }

        //once loop is done, monster says total of salads made
        System.out.println("We made " + nibbleSalads + " salads together!");
        System.out.println("Come back whenever you want to play Snoop Dogg and Martha.");
        input.close(); //closing the scanner
    }
}
    


