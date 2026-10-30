package DSA.NESTED_LOOP;

public class program22 {
    public static void main(String[] args) {
        int limit = 7;
        int a = 0 , b= 1;

        for(int i =0; i < limit;i++){
            int sum = a + b;

            System.out.print(a + " ");

            a = b;
            b = sum;
        }

    }

}
