// midterm practice on paper #3

// first draft since i didn't know how to add two input values in one line 
//import java.util.Scanner;
//
//public class TipCalculator{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter the subtotal: ");
//        double subtotal = input.nextDouble();
//        
//        System.out.println("Enter the gratuity rate: ");
//        double gratuityRate = input.nextDouble();
//        
//        double gratuity = gratuityRate / subtotal;
//        
//        double total = subtotal + gratuity;
//        
//        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
//    }
//}


// learned new better, simpler code
import java.util.Scanner;
public class TipCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the subtotal and the gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = gratuityRate / subtotal;
        
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}