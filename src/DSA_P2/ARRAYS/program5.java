package DSA_P2.ARRAYS;
import java.util.Arrays;

public class program5 {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,1,8};
        for (int i = 0; i < arr.length; i++) {
            if(i %2 == 0){
                arr[i]+=10;

            }else{
                arr[i]*=2;
            }
            System.out.println(arr[i]);
        }
    }

}
