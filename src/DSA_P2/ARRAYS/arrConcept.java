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
    and in java we call this as pass by val that we are just passing the value of the arr box not the actual array
     */

    /* Another concept is of shallow copy vs deep copy
    shallow copy means create another array like y and putting it equal to the x and when we make the change the
    changes in the y that will directly reflect to the actual array
    e.g on paper writing the name and then changing that papers data or name to other on the same paper called as shallow copy
    while
    deepcopy means making photocopy of that paper and changing the name on that photocopy

    to make deep import arrays package
    then create deep arr and then keep it equal to Arrays.copyof(arr, arr.length);
    deep[0]  = 100;


    Another each array element take 4 bytes so 3 elements will take 12 bytes and these are at the same in the storage
    one after another called as continuous contigous or memory allocation
     */

}


