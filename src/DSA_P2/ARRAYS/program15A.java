package DSA_P2.ARRAYS;

public class program15A {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,15 };
        // arr = 2,4,6,5,9,8
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i+1];
            arr[i+1] = arr[i];
        }
        for(int ele: arr){
            System.out.print(ele+ "  ");
        }


    }}
