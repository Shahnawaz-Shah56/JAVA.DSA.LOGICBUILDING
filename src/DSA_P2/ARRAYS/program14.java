package DSA_P2.ARRAYS;

public class program14 {
    public static void main(String[] args) {
        int arr[]= {0,0,0,1,0,0,1,0,0,1,0,1,1,0,1,0,1,1,1,0,0,1,0};

        int a = 0, b = arr.length-1;


        while(a < b){
            if(arr[a] == 1 && arr[b] == 0){
                int c = arr[b];
                arr[b] = arr[a];
                arr[a] = c;

                a++;
                b--;
            } else if (arr[a]==1 && arr[b]==1) {
                b--;

            } else if (arr[a]==0 && arr[b]==0) {
                a++;
            } else if (arr[a] == 0 && arr[b] == 1) {
                a++;
                b--;
            }
            if(a>b){
                break;
            }


        }

        for(int ele : arr){
            System.out.print(ele + " ");
}}}
