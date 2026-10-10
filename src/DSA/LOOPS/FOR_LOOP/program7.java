package DSA.LOOPS.FOR_LOOP;

public class program7 {
    public static void main(String[] args) {
        int n = 5;
        char alpha =65;


        for (int i = 1; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if(i % 2 == 0){

                    System.out.print(alpha);
                }else {
                    char small = (char) (alpha + 32);  /* in this line I learned that sometimes error happens due to
                    not doing the type conversion as I first did "char small = alpha + 32 directly which gave me error now
                    did type conversion and solved"*/
                    System.out.print(small);
                }


            }

            System.out.println();
            alpha++;


        }


    }

}
