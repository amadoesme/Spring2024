public class PlusDemo {
    public static void main (String[] args) {
        int one, two, three;
        
        one = 1;
        two = 2;
        three = 3;
        
        int sum = one + two + three;
        //String s = one + two + three;
        //String s2 = 6;
        String s = "" + one + two + three;
        String s2 = "" + 6;

        System.out.println(s2);
        System.out.println(s);
        System.out.println("123");
        System.out.println(one + two + three);
        System.out.println("sum is " + (one + two + three));
        System.out.println("sum is " + one + two + three);
        System.out.println("sum is " + sum);
    }
}
