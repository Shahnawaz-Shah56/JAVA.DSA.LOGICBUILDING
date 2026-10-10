package DSA.NESTED_LOOP;

public class program13 {
    public static void main(String[] args) {
        int n = 5;
        char alpha = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print((char) (alpha + j));
                }
            }
            System.out.println();

        }
    }
}
