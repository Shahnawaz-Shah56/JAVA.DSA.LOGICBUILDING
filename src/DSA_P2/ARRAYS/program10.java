package DSA_P2.ARRAYS;

public class program10 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 7, 9, 7};

        int a = 0, b = arr.length - 1, r = 2;

        while(r > a){

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
