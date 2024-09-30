import java.util.Scanner;

public class PracticeSalad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // the user inputs the number of snacks for the monster
        System.out.print("How many snacks do you have for the nibble monster: ");
        int snacks = input.nextInt();
        System.out.println("If they are all nibbles I'll make 1 salad for us :D");

        // I made these counters because that's what I understood from the hint
        int collectedNibbles = 0; // counter for the number of nibbles collected
        int nibbleSalads = 0; // counter to keep track of the number of salads made
        String saladBowl = ""; // String variable to hold the salad ingredients

        // after the user tells the monster the number of snacks,
        // the monster asks for them to start feeding him
        for (int numSnacks = snacks; numSnacks > 0; numSnacks--) {
            System.out.println("Monster hungry :E");
            System.out.print("Feed monster a nibble :o ");
            char myNib = input.next().charAt(0);

            // options so the user can feed the monster
            if ((myNib >= '0' && myNib <= '9') || (myNib >= 'A' && myNib <= 'F') || (myNib >= 'a' && myNib <= 'f')) {
                System.out.println("Nibble monster likes!");
                collectedNibbles++; // Increment the nibbles counter
                saladBowl += myNib; // Add the nibble to the salad bowl
            } else {
                System.out.println("NO!");
            }

            // monster makes salads after receiving 3 nibbles not snacks
            if (collectedNibbles == 3) {
                System.out.println("<3 <3 <3 S A L A D  T I M E  <3 <3 <3");
                System.out.println("             " + saladBowl + "             ");
                System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");

                nibbleSalads++; // increment the salads counter, also from a hint
                collectedNibbles = 0; // resetting the nibble counter for the next salad
                saladBowl = ""; // empty the salad bowl for the next salad
            }
        }

        // once loop is done, monster says total of salads made
        System.out.println("We made " + nibbleSalads + " salads together!");
        System.out.println("Come back whenever you want to play Snoop Dogg and Martha.");
        input.close(); // closing the scanner
    }
}

