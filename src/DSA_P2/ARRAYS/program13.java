package DSA_P2.ARRAYS;

public class program13 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5};

        int n = arr.length;
        int arrSum = 0;
        int sum =  n*(n+1)/2;
        for (int i = 0; i <= n-1; i++) {
            arrSum =+ arr[i];
        }
        int out = sum-arrSum;


        System.out.println(out);
    }


}
