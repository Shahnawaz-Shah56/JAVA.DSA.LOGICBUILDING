package DSA.NESTED_LOOP;

public class program12 {
    public static void main(String[] args) {
        int n = 5;
        char alpha = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alpha);
            }
            System.out.println();
            alpha++;
        }
    }

}
