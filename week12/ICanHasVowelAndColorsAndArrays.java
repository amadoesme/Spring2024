import java.util.Scanner;

public class ICanHasVowelAndColorsAndArrays{
    static final String MAGENTA_BG = "\u001B[45m";
    static final String RESET = "\u001B[0m";
    static final String BLUE_TEXT = "\u001B[34m";
    
    public static void main(String[] args){
        //for(String s: args){
            //System.out.println(s);
        //}
        String text;
        if(args.length > 0 && args[0].equalsIgnoreCase("-lazy")){
            text = "laziness is a puritanical construct";
        }
        else{
            Scanner input = new Scanner(System.in);
        }
        
        Scanner input = new Scanner(System.in);
        
        //get a line of text of user input
        text = getLineOfText(input);
        
        //separate consonants from vowels
        String vowels = getVowels(text);
        String consonants = getConsonants(text);
        
        //display the vowels in users input
        System.out.println(vowels);
        
        //display the number of vowels in users input
        System.out.println("There are " + vowels.length() + " vowels");
        
        //display the consonants in users input
        System.out.println(consonants);
        
        //display the number of consonants in users input
        System.out.println("There are " + consonants.length() + " consonants");
        
        //check if the text is a palindrome (readible backwards and fowards)
        String letters = removeNonLetters(text);
        System.out.println(letters);
        
        if(isPalindrome(letters.toLowerCase())){
            System.out.println("It's a palindrome"); 
        }
       System.out.println(blue(text)); 
       System.out.println("default text color"); 
       System.out.println(magentaBackground(text)); 
       System.out.println("default bg color");
       System.out.println(magentaBackground(blue(text)));
       System.out.println("plain color");
    }
    
    public static String blue(String s){
        return BLUE_TEXT + s + RESET;
    }
    
    public static String magentaBackground(String s){
            return MAGENTA_BG + s + RESET;
    }
    
    public static String removeNonLetters(String s){
        String justLetters = "";
        
        for(int i = 0; i< s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                justLetters += s.charAt(i);
            }
        }
        
        return justLetters;
    }
    
    public  static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
         return true;
    }
    
    public static String getLineOfText(Scanner input){
        System.out.println("Please enter a line of text: ");
        String text = input.nextLine();
        return text;
        //can also use return input.nextLine();
    }
    
    public static String getVowels(String s){
        String vowels = "";
        
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowels += s.charAt(i);
            }
        }
        
        return vowels;
    }
    
    public static boolean isVowel(char ch){
        switch(Character.toLowerCase(ch)) {
            case 'a':  
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': return true;
            default: return false;
        }
    }
    
     public static String getConsonants(String s){
        String consonants = "";
        
        for(int i=0; i<s.length(); i++){
            if(!isVowel(s.charAt(i))){
                consonants += s.charAt(i);
            }
        }
        
        return consonants;
    }
    
     public static boolean isConsonant(char ch){
        return Character.isLetter(ch) && !isVowel(ch);
        }
    }