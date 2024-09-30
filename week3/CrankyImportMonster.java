import java.util.Scanner;

public class CrankyImportMonster {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey there what's your name? ");
        String userName = input.next();
        
        System.out.print(userName + "? Wow I'm sorry your mom didn't love you...");
        
        System.out.println("How old are you " + userName + "? ");
        int userAge = input.nextInt();
        
        System.out.println("boo B O O M E R boo");
    }
}