// midertm practice code on paper #1

import java.util.Scanner;

public class CelsiusToFarenheit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a degreee in Celsius: ");
        double celsius = input.nextDouble();
        
        double farenheit = 9.0/5.0*celsius+32;
        
        System.out.println(celsius + " Celsius is " + farenheit + "Farenheit");
    }
}