public class NumericalTypesDemo{
    public static void main(String[] args){
        byte smol = 89;
        int big = smol;
        big = 200;
        smol = (byte) big;
        System.out.println("smol is: " + smol);
        
        double decimalNum = 80.0;
        smol = (byte) decimalNum;
        System.out.println("smol is: " + smol);
        
        long veryBig = 79;
        decimalNum = veryBig;
    }
}

// the largest byte we can store in a byte is 127 (0111 1111)
// the smallest is -128