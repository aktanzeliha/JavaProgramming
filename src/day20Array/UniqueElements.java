package day20Array;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C£", "Phyhon", "Phyhon", "Zeliha"};

        for (int j = 0; j < words.length; j++) {


            String element = words[j];// 0 indexli word is "Java"
            //   asagida yazacagimiz programa ile tek tek ilk element olan "java"
            // ile kiyaslayacak bununla aynimi degisikmi diye, sonra ilk defa karsilastigi elenemet unique olacak

            int frequency = 0;
            for (int i = 0; i < words.length; i++) {// words.fori yazinca short cuttan yazdik burayi
                if (words[i].equals(element)) {
                    frequency++;
                }

            }// find the frequency in this loop
            if (frequency == 1) {




            System.out.println(element);

        }}
    }
}
/* burasini notlardan coppy paste yaptim, yukarida anlamadim ama yukaridaki de dogru calisti
for (int j = 0; j < words.length; j++) {

            String element = words[j]; //"Java"
            int frequency =0;
            for (int i = 0; i < words.length; i++) { // finds the frequency of element from array
                if(words[i].equals(element)){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }

        }





    }

}
 */