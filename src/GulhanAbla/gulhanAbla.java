package GulhanAbla;

public class gulhanAbla {
    public static void main(String[] args) {
        long[][][] matris = new long[3][3][3];
        long sayi=1, p=2;
        for (int a = 0; a < 3; a++)
            for (int b = 0; b < 3; b++)
                for (int c = 0; c < 3; c++) {
                    sayi=(long)(sayi*2+sayi);

                     matris[a][b][c] = (long)sayi;
                }
        for (int a = 0; a < 3; a++) {

            for (int b = 0; b < 3; b++) {

                System.out.println(" ");
                for (int c = 0; c < 3; c++) {
                    System.out.print(matris[a][b][c]);
                    System.out.print(" ");

                }
            }
        }
    }
}