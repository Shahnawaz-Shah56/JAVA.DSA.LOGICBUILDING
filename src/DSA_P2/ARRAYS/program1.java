package DSA_P2.ARRAYS;

public class program1 {
    public static void main(String[] args) {
        int max = 0;

        int[] numArr = {10,29,7,89,57,38,30,79,88};
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]< max && numArr[i] > numArr.length){
                max = numArr[i];
            }
        }
        System.out.println(max + " is the max number in this arr");
    }

}
