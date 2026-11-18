package DSA_P2.ARRAYS;

public class program16 {
    public static void main(String[] args) {
        int a[] = {2,5,6,9};
        int b[]= {1,3,4,5,6,7,8};
        int c[]= new int[a.length + b.length];
        int i =0;
        int j = 0;
        int k =0;

        while ( i< a.length && j < b.length){

            if(a[i]<b[j]){ c[k++] = a[i++];
            }else{c[k++] = b[j++]; }

            if(i == a.length ){
                c[k++] = b[j++];
            } else if (j == b.length) {
                c[k++]= a[i++];
            } }
        for(int ele : c){
            System.out.print(ele + " ");

        }

    }

}
