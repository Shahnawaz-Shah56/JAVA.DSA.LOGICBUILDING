package NESTED_LOOP;

public class program2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n ; i++) {

//            System.out.println("\n");

            for(int j = 0 ; j <= 4 - i ; j++){
                System.out.print("* ");

            }
            System.out.print("\n");



        }
    }
}
