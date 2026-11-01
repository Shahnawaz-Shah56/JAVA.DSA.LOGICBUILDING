package DSA_P2.ARRAYS;

public class program7 {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,1,8};
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
             product = product * arr[i];
        }
        System.out.println(product);
    }

}
