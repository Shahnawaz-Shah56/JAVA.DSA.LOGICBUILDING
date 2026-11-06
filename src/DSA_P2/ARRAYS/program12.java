package DSA_P2.ARRAYS;

public class program12 {


    public static void main(String[] args) {

        int arr[] = {2, 3, 7, 29, 20, 1, 38};

        int r = 2;
        int n = 2;
        int a = 0;

        while(a < n){

            int c = arr[n];
                arr[n] = arr[a];
                arr[a] = c;

                a++;
                n--;


            a = 3;
            n = arr.length-1;

            while(a < n){

                c = arr[n];
                arr[n] = arr[a];
                arr[a] = c;

                a++;
                n--;



            }

            a = 0;
            n = arr.length-1;


            while(a < n){

                c = arr[n];
                arr[n] = arr[a];
                arr[a] = c;

                a++;
                n--;


            }








        }



        for(int ele : arr){
            System.out.print(ele + " ");
        }







    }

}
