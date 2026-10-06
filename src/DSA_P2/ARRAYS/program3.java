package DSA_P2.ARRAYS;

public class program3 {
    public static void main(String[] args) {
    int [] arr = {2,2,4,2,77,1,2,3,9};
    int target = 77;
    int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == target){
                count++;
            }

        }
        System.out.println(target + " occures" + count + "times in this arr");

    }

}
