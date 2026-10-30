package DSA.NESTED_LOOP;

public class program21 {
    public static void main(String[] args) {


        int n = 4;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < i; k++) {
                System.out.print(num);
                num++;
            }



                num = 1;
            System.out.println();







        /*a
        ...1
        ..12
        .123
        1234
         */
        }
    }
}
