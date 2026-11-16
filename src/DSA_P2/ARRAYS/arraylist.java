package DSA_P2.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;


public class arraylist {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(33);
        arr.add(10);
        System.out.println(arr.get(2));
        arr.set(2,40);
        System.out.println(arr.get(2));
    }


}
