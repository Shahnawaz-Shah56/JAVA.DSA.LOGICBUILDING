package DSA.LOOPS.FOR_LOOP.WHILE_LOOP;

public class program0 {
    public static void main(String[] args) {
        int n = 154;


        while (n > 0){
            int lastdig = n % 10;
            System.out.println(lastdig);
            n /= 10;
        }
    }

}
