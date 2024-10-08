public class InLivingColor{
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN_BG = "\u001B[46m";
    
    public static void main(String[] args){
        System.out.println("This is " + red("RED"));
        System.out.println("This is " + green("GREEN"));
        System.out.println("This is " + yellow("YELLOW"));
    }
    
    public static String red(String s){
        return RED + CYAN_BG + s + RESET;
    }
    
    public static String green(String s){
        return GREEN + s + RESET;
    }
    
    public static String yellow(String s){
        return YELLOW + s + RESET;
    }
}