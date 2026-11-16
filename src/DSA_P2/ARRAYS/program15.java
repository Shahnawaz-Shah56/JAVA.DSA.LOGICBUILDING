package DSA_P2.ARRAYS;

public class program15 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,15 };
        // arr = 2,4,6,5,9,8
        for (int i = 0; i < arr.length; i++) {


            if(i %2 == 0){
                arr[i]++;
            }else{arr[i]--;}

        }
        for(int ele: arr){
            System.out.print(ele+ "  ");
        }


}}
