package DSA_P2.ARRAYS;

import java.util.Scanner;

public class arr {

    public static void main(String[] args) {
//        int ageArr[]= {20, 20,18,82,11};
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]*2);
        }



        

    }

}
