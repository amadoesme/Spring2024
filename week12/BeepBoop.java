/* Names: Esmeralda Amado
 * Course: CS2011
 * Section: 09 & 10
 * Description: Porgram prints out numbers from
 1 to 100 and if num is divisible by 3 it prints
 beep, if divisible by 5 boop.
 * Other comments: N/A
 */

public class BeepBoop {
    public static void main(String[] args) {
        
        //beggining of for loop
        for (int num = 1; num <= 100; num++) {
            //if num is divisible by 3 says beep
            if (num % 3 == 0) {
                System.out.println("Beep");
            //if divisible by 5 says boop
            } else if (num % 5 == 0) {
                System.out.println("Boop");
            }else {
                System.out.println(num);
            }
        }
    }
}
 //else if(num%15==0)
//System.out.println("BeepBoop");