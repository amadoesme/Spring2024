public class MatroyskaLoops{
    public static void main(String[] args){
//        for(int i=0; i<4; i++){
//            //System.out.println(i);
//            for(int j=0; j<3; j++){ 
//               System.out.print("*"); //prints 12 times cause i*j 
//            }
//            System.out.println();
//        }
        displayPattern(3,4, "<3");
        System.out.println();
        displayPattern(5,7, "* ");
    }
    
    public static void displayPattern(int rows, 
                                      int cols, 
                                     String pic){
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
               System.out.print(pic); 
            }
            System.out.println();
        }
    }
}