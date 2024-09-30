import java.util.Scanner;

public class OrangeCat{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String[] toys;
        
        System.out.print("How many toys would you like to give to Garfield: ");
        int numToys = input.nextInt();
        
        toys = new String[numToys + 1];
        
        getToysFromUser(input, toys, numToys);
    }
    
    public static void getToysFromUser(Scanner input, 
                                       String[] toys, 
                                       int numToys){
        input.nextLine();
        for(int i = 0; i < numToys; i++){
            System.out.println("Gimmie a toy! ");
            toys[i] = input.nextLine();  
        }
        
    }
    
    
    
    public static void losingLasagna(Scanner input,
                                    String[] toys){
        System.out.println("Help garfield win some lasagna!");
        System.out.println("Just answer the arithmetic puzzle you will see in a moment");
        System.out.println("Carfeul if you answer we take away 1 of his toys");
        
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        
        System.out.print("What is " + num1 "+ " + num2 + " ?");
        int answer = input.nextInt();
        
        if(answer == num1 + num2){
          System.out.print("YUUUH");
          toys[toys.length - 1] = "lasagna!";
        }
        else{
            System.out.print("LOSER");
            int index = (int)(Math.random() * (toys.length - 1));
            System.out.print("you cost garfield his " + toys[index] + "!");
            toys[index] = null;
        }
    }
}