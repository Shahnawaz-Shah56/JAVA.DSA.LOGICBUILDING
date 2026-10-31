package DSA_P2.ARRAYS;

public class arrConcept {
    public static void main(String[] args) {
        int x[] = {10,20,30,50};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] y){
        y[2] = 99;
    }
    /* why we can change the val of x arr using the y arr in change function actually we aren't create the new arr we are just
    accessing the arr address by both x and y and we can make the change by any var whether its x or y
     */

}
