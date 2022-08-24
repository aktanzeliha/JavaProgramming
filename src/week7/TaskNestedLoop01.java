package week7;

public class TaskNestedLoop01 {
    public static void main(String[] args) {
    /*
   1                  = rowCount-1
   2  6               = rowCoun -1      rowCoun -2
   3  7  10           =rowCoun -1      rowCoun-2   rowCoun -3
   4  8  11  13
   5  9  12  14  15
whay is repeating, and how is it repeating ? ask youself
pattene bulmak gherekiyor mesela 2 ile 6 arasinda 4 fark var, 4 ile 8 arasinda yine 4,
5 ile 9 arassinda da 4 fark var, 7 ile 10 arasinda 3 fark var, 8 ile 11 arasinda da 3 fark var.... bunlar pattern
rowcount= 5
coloumcount= 5

algorithm
nested loop
outer loop should handle rows
inner loop should handle coloums

 */

int rowCount= 10;
        for (int row = 1; row <= rowCount ; row++) {
            int value = row;
            for (int col = 0; col <=row ; col++) {
                System.out.print(value+ " ");
                value+= rowCount -col;
            }
            System.out.println();
        }






    }
}
