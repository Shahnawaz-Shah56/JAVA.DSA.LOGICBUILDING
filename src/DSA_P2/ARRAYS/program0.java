package DSA_P2.ARRAYS;

public class program0 {
    public static void main(String[] args) {
        int max = 0;
        int secondMax = 0;
        int[] arr = {10, 2, 29, 8, 4, 19, 0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > secondMax && arr[j] < max){
                    secondMax = arr[j];
                }
            }
//            System.out.println(secondMax);
        }
        System.out.print(secondMax + "is the secondgreatest greatest in the arr");
    }

}
