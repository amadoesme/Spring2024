/* Names: Esmeralda Amado, Cesar Martinez
 * Course: CS2011
 * Section: 09 & 10
 * Description: Program that converts Japanese Yen to US Dollars.
 * Other comments: N/A
 */

//this will import the scanner library
import java.util.Scanner;
public class CurrencyConverter{
    public static void main (String[] args){
        Scanner money = new Scanner (System.in);
        
        // 1 (United States Dollar) USD = 147.36 JPY as of 9/13/2023
        double conversionMoney = 147.36;
        
        // user inputs the amount of JPY they want to convert
        System.out.print("Enter the amount of Japanese Yen to convert: ");
        double japYen = money.nextDouble();
        
        // to convert the money you have to divide the JPY with USD
        double usaDollar = japYen / conversionMoney;
        
        // the program prints out the equivalent amount in USD
        System.out.print("Amount in Us Dollars: " + usaDollar);
        
    }
}
  