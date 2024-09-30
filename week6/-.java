public class AmICool{
    public static void main(String[] args){
        boolean isCool1, isCool2, isCool3;
        
        isCool1 = Math.random() < 0.7;
        isCool2 = Math.random() < 0.5;
        isCool3 = Math.random() < 0.2;
        
        if(isCool1 && isCool2 && isCool3){
            System.out.println("Cool as ice!");
        }
        else if(isCool1 || isCool2 || isCool3){
            System.out.println("Lukewarm");
        }
        else(){
            System.out.println("Sorry, 'fraid not.")
        }
    }

}