package DSA_P2.ARRAYS;

public class program9 {
    public static void main(String[] args) {
        int arr[] = {2,3,7,6,9,7,1};
        int a = 0, b = arr.length-1;
        System.out.println();
    while (a < b){

        /* Two pointer techniques where i use the two points or two vars to solve any problem

         */

        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        a++;
        b--;




    }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }


}
