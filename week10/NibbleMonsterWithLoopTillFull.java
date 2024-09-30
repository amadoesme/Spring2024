/* Names: Esmeralda Amado, Maxwell Phung
 * Course: CS2011
 * Section: 09 & 10
 * Description: Nibble monster ask's how many
 snacks the user has and the monster answers
 if they like the snack or not and let's it 
 know it's hunger level.
 * Other comments: N/A
 */

//importing the random and scanner library
import java.util.Random;
import java.util.Scanner;

public class NibbleMonsterWithLoopTillFull {
    public static void main(String[] args) {
        
        //initializing the hunger level using Random
        Random rand = new Random();
        int hungerLevel = rand.nextInt(501);

        Scanner charReader = new Scanner(System.in);

        //the monster lets the user know its hunger level
        System.out.println("Monster hungry :E");
        System.out.println("H U N G E R: " + hungerLevel);

        while (hungerLevel > 0) {
            System.out.println("Feed monster a nibble :o ");
            char myNib = charReader.next().charAt(0);

            //options for the user to feed monster and after feeding
            //him it lets the user know its decremented hunger level
            if (myNib >= '0' && myNib <= '9') {
                System.out.println("Nibble monster likes!");
                hungerLevel -= (int) myNib;
                System.out.println("H U N G E R: " + hungerLevel);
            } 
            else if (myNib >= 'A' && myNib <= 'F') {
                System.out.println("Delish!");
                hungerLevel -= (int) myNib;
                System.out.println("H U N G E R: " + hungerLevel);
            } 
            else if (myNib >= 'a' && myNib <= 'f') {
                System.out.println("Yummeh!");
                hungerLevel -= (int) myNib;
                System.out.println("H U N G E R: " + hungerLevel);
            } 
            else {
                System.out.println("NO!");
                hungerLevel += (int) myNib;
                System.out.println("H U N G E R: " + hungerLevel);
            }
        }
        //once the monster gets full it lets the user know and program ends
        System.out.println("Monster full :) \nYou may go.");
        charReader.close();
    }
}
