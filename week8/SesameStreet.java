//demo

public class SesameStreet{
    public static void main (String[] args){
        int randomNum = (int)(1 + Math.random() * 20);
        char randomChar;
        //randomChar= (char)('A' + Math.random() * ('Z'-'A' + 1));
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomIndex = (int)(Math.random() * alphabet.length());
        randomChar = alphabet.charAt(randomIndex);
        
        System.out.println("This program is brought to you by number "
                          + randomNum
                          + " and the letter "
                          + randomChar);
    }
}