package NESTED_LOOP;

public class program6 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n; i++) {
            for (int k = -4; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            i++;



            System.out.println();
        }


    }
}



