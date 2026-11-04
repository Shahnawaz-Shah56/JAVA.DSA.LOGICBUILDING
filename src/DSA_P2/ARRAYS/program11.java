package DSA_P2.ARRAYS;

public class program11 {
    public static void main(String[] args) {

        int arr[] = {2, 3, 7, 29, 20, 1, 38};

        int a = 0, b = arr.length - 5 , r = 2;


        while (a < b && a <= r){

            int c = arr[b];
            arr[b] = arr[a];
            arr[a] = c;

            a++;
            b--;


        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }







    }

}
