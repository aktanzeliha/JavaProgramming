package Replit_questions;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 0;
       // int growth = 0;
        int treesize = 0;


        for (int i = 1; i <= 3; i++) {
            year = i;
            treesize=treesize+1;
            System.out.println("year "+ year+" - growth 1 cm");
            System.out.println("tree size: "+ treesize+"cm");
        }

        for (int i = 4; i <=10 ; i++) {
            year = i;
            treesize=treesize+2;
            System.out.println("year "+ year+" - growth 2 cm");
            System.out.println("tree size: "+ treesize);
        }



    }


}
/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
 */