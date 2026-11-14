package DSA_P2.ARRAYS;

public class program13A {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,9};
        int n = arr.length;

        int arrSum = 0;

        int sum = n*(n+1)/2;

        for(int i = 0; i < arr.length-1;i++){
             arrSum = arrSum +arr[i];
        }
        int missingEl = sum-arrSum;
        System.out.println(missingEl);
    }


}
