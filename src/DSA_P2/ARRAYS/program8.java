package DSA_P2.ARRAYS;

public class program8 {
    public static void main(String[] args) {
        int target = 4;
        boolean found = false;

        int arr[] = {2,2,6,1,8};
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];
                if(sum == target){
                    found = true;
                    System.out.println("Elements which match the sum of the target are:" +
                            " "+arr[i]+" and "+ arr[j]);

                    break;
                }

            }



        }
        if(found){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }

}
