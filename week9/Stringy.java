import java.util.Scanner;

public class Stringy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = input.nextLine();
        
        // sees what the string contains
        //System.out.println("name: "+ name);
        
        // trims spaces that the user puts
        name = name.trim();
        
        //System.out.println("name after trim: " + name);
        
        if(!name.contains(" ")){
            System.out.println("what are you famous???");
        }
        else if(Character.isDigit(name.charAt(0)) ){ //'0' <= name.charAt(0) && name.charAt(0) <='9'
            System.out.println("Oh no, is your dad Elon Musk? Sorry matey!");
        }
        else{
            System.out.println("Hey you!");
        }
        
        input.close();
    }
}

//immutable means you can't change it