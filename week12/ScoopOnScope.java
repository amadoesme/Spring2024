public class ScoopOnScope{
    public static void main(String[] args){
        int num;
        num = 3;
        
        displayNum(num);
        
        num++;
        
        displayNum(num);
        
        increaseNum(num);
        
        displayNum(num);
    }
    
    public static void increaseNum(int num){
        num++;
        displayNum(num);
    }
    
    public static void displayNum(int num){
        System.out.println("num is " + num);
    }
}