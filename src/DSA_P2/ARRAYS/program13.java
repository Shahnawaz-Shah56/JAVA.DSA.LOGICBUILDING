package DSA_P2.ARRAYS;

public class program13 {
    public static void main(String[] args) {

        int arr[] = {1,2,4,5,6};
        int prevVal = 0;
        boolean target = false;
        int val=0;


        for (int i = 0; i < arr.length; i++) {
            if(i != 0){
                 val = arr[i]-prevVal;


            }
            prevVal = arr[i];
            if(val == 2){
                target = true;
                break;
            }



        }
        System.out.println(prevVal-1);

    }


}
