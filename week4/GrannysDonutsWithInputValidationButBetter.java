import java.util.Scanner;

public class GrannysDonutsWithInputValidationButBetter{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many boxes of donuts would you like to get? ");
        int numDonutBoxes = input.nextInt();
        
        if (numDonutBoxes < 0){
            System.out.println("No donuts for you!");
            System.exit(1);
        }
        
        else{
            System.out.println("How many friends are you feeding? ");
            int numFriends = input.nextInt();
        
            if (numFriends <= 0){
                System.out.println("Come back after you get some friends");
                System.exit(2);
            }
            
            
            final int DOZEN = 12;
      
            int totalDonuts = numDonutBoxes * DOZEN;
        
            int donutsPerPerson = totalDonuts/ numFriends;
        
            System.out.println("Give each friend " + donutsPerPerson + "donuts");
        
            
            int leftoverDonuts = totalDonuts % numFriends;
            System.out.println("Please deliver " + leftoverDonuts + 
                               " to your programmer professor" );
            
        }
        
        
        
        input.close();
    }
}