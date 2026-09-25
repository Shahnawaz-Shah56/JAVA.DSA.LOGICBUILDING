package FOR_LOOP;

public class program3 {
    public static void main(String[] args) {
        int n = 18;
        for (int i = 1; i < n; i++) {
            if(n % i  == 0){
                System.out.println(i + " is the factor of the " + n);
            }

        }
    }

}
