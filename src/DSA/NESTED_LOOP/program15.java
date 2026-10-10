package DSA.NESTED_LOOP;

public class program15 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*  ");
                if(i != 0 && i != n){
                    for (int k = 0; k < 6; k++) {
                        System.out.print("  ");

                    }
                    j = n;
                    System.out.print("   *");

                }

            }

            System.out.println();
        }
    }

}
