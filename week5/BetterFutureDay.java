/* Names: Esmeralda Amado, Janelle Rivera
 * Course: CS2011
 * Section: 09 & 10
 * Description: We added if else statements to 
 the code we had to download. This code calculates
 the day of the week it will be based on the present
 day and the number of days the user inputs.
 * Other comments: N/A
 */

//this will import the scanner library
import java.util.Scanner;

public class BetterFutureDay {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What weekday is it today? ");
    System.out.println("Please enter: ");
    System.out.println("  0 for Monday");
    System.out.println("  1 for Tuesday");
    System.out.println("  2 for Wednesday");
    System.out.println("  3 for Thursday");
    System.out.println("  4 for Friday");
    System.out.println("  5 for Saturday");
    System.out.println("  6 for Sunday");
    
    int weekdayNum = input.nextInt();

    // the user inputs a number so the program can tell the user
    // the day of the week it will be after certain number of days
    System.out.println("Please enter a positive number "
                        + "and I'll tell you what weekday "
                        + "it will be after that many days pass.");
    int numDaysIntoFuture = input.nextInt();

    final int NUM_DAYS_PER_WEEK = 7;

    int futureWeekdayNum = (numDaysIntoFuture + weekdayNum) % NUM_DAYS_PER_WEEK;
        
    //in this part of the code we added the if else statements    
    //this is were the user picks the number of the present day
    String futureDay="";    
    if (futureWeekdayNum ==0){
        futureDay="Monday";
    }else if (futureWeekdayNum == 1){
        futureDay = "Tuesday";
    }else if (futureWeekdayNum == 2){
        futureDay = "Wednesday";
    }else if (futureWeekdayNum == 3){
        futureDay = "Thursday";
    }else if (futureWeekdayNum == 4){
        futureDay = "Friday";
    }else if (futureWeekdayNum == 5){
        futureDay = "Saturday";
    }else{
        futureDay = "Sunday";
    }

    System.out.println(" In " + numDaysIntoFuture + " days it will be "
                       + futureDay);
    input.close();
  }
}
