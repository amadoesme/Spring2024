public class MethodMen{
    public static void displayHelloWorld(int times){
        for(int i=0; i<times; i++){
            displayHelloWorld();
        }
    }
    
    public static void main(String[] args){
        //System.out.println("HelloWorld");
        displayHelloWorld(); //doesnt have
        displayHelloWorld(3); //has parameters
        //displayHelloWorld(3,3); doesnt work
//        String msg = getHelloWorldMsg();
//        System.out.println(msg);
        System.out.println(getHelloWorldMsg);
    }
    public static void displayHelloWorld(){
        System.out.println("Hello World");
        
    }
    
    public static String getHelloWorldMsg(){
        return "Hello World!";
    }
}