package day21;
import java.util.Arrays;
public class arraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);
// yukarida sadece ilk iki ismi copy yapmak istedigimiz icin parentez icinde studentten sonra 2 yazdik,
        // ilk 5 ismi coppy yapmak isteseydik 5 yazardik.
        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 4); //{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1 );// from 2 deyince index numbrei 2 olandan baslar ama to 6 yazdiginizda
        // index numberi 5 olani yazar 6 olan i yazmaz, 6 yida dahil etmek istersek +1 yazman teyerli, yada direk 7 yazariz.

        System.out.println(Arrays.toString(ch2));


        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //index:         0   1   2   3   4   5   6   7   8  9
        int[] result = Arrays.copyOfRange(scores, 3, 8);


        System.out.println(Arrays.toString(result));


        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);// 5 den sonun kadar yazdirmak istedigimiz zaman boyle yaziyoruz, son yazilan eleneti yazdirmadigi icin en son elementide
        // yazdirabilsin diye scores.length dememiz lazim.
        System.out.println(Arrays.toString(result2));



    }
}
