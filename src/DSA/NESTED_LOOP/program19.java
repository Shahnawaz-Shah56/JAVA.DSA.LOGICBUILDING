package DSA.NESTED_LOOP;

public class program19 {
    public static void main(String[] args) {
        int n = 6;
        int num = 1;


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                int val = i+j;
                if(val % 2 !=0){
                    System.out.print(num);
                }else {
                    System.out.print(0);
                }
            }

            System.out.println();
            /* output required
        1
        01
        101
        0101
         */


        }
    }

}
