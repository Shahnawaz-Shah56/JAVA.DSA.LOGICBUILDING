package DSA_P2.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the arr elements :"+" ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element vals :"+ " ");

            arr[i] = sc.nextInt();
            System.out.print(arr[i]);
             sum += arr[i];
        }
        System.out.println( "element valuse sum is :"+" "+sum);






        }




    }


