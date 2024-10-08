/* Names: Esmeralda Amado, Janelle Rivera
 * Course: CS2011
 * Section: 09 & 10
 * Description: Fixing the logic statements and adding the 
 missing brackets. The code tells the letter you get based
 on the number of the students grade. 
 * Other comments: N/A
 */

//this will import the scanner library
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your score out of 100? ");
        int score = input.nextInt();
        String letterGrade;

        //fixed this part of the code
        if (score >= 90 && score <= 100) {
            letterGrade = "A";
        } else if (score >= 80 && score < 90) {
            letterGrade = "B";
        } else if (score >= 70 && score < 80) {
            letterGrade = "C";
        } else if (score >= 60 && score < 70) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Your grade is " + letterGrade);
    }
}
