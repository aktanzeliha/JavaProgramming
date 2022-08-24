package week7;

public class TaskNestedLoop02 {
    public static void main(String[] args) {

/* write a code to print the following pattern
1
10
101
1010
10101
101010
we have 6 rows and 6 columns
patter odd lolumns; "1", even column "0"

 */
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= i; j++) {//


               // int m=3;// burasi bir arkadastan coppy paste yapmistim, teacher bunlari eklemdi bunlarsinda dogru cikiyor
               // int dummy=j + 1 + i +m;

                if (j %2== 0) {
                    System.out.print(1 );
                } else {
                    System.out.print(0);
                }


            }
            System.out.println();


        }

    }
}
