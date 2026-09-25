package FOR_LOOP;

public class program4 {
    public static void main(String[] args) {
        int n = 12;
        int c = 0;
        for (int i = 1; i <= n; i++) {

            if(n % i == 0) c++;


//
        }
        System.out.println("c equals to " + c);

        System.out.println(c == 2 ? n + " is prime number": n + " isn't prime");







//        System.out.println(n + " is prime number");
    }

}
