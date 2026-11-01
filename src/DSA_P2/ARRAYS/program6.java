package DSA_P2.ARRAYS;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 6, 9, 4, 1};
        int var = 20;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]== var){
                flag = true;
                break;
            }


        }
        if (flag){
            System.out.println(var + " present in the arr");

        }else{
            System.out.println(var + " not present in the arr");
        }
        /*
        learned new concept of using break and flag in the loops*/



    }}