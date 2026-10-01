package DSA_P2.ARRAYS;

public class program0 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {10, 2, 29, 8, 4, 9, 0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max + "is the greatest in the arr");
    }

}
