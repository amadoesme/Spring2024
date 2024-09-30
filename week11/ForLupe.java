import java.util.Scanner;

public class ForLupe{
    public static void main(String[] args){
        
//        int counter = 0;
//        while(counter++ < 60){
//            System.out.println(counter + " Eid Mubarak!");
//            //counter++;
//        }
//        
//         System.out.println("Counter is: " + counter);
        //int i = 1;
//        for(int i = 1; i <= 60; i++){
//            System.out.println(i + " Eid Mubarak!");
//            if (i % 4 == 0){
//                System.out.println(i + " Say something");
//            }
//            if(i % 12 == 0){
//            System.out.println(i + "I'm walking here");
//            }
//        }
        //compiler complains cause i only exists in the for loop
        //System.out.println("i is: " + i);
        
        
        //using same file new example
//        for(int i = 10; i > 0; i-=2){
//            System.out.println(i + " is i");
//        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number up to 127");
        byte num = input.nextByte();
        
        int factorial = 1;
        
        for(int i;i<= num; i++)
            factorial *= i;
        
        System.out.println("factorial of " + num + "is: " + factorial);
   }
}