package day20Array;

public class AppearedTwice {
    public static void main(String[] args) {

        //char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        // for (int j = 0; j < chars.length; j++) {

/*
bu en bastaki for loopu sonradan yaziyoruz. short cut kullanip yazdik yani chars.fori yazdik
ve basla hic ektra birsey yazmadik direk en basta yazdigimiz ikinci for loopu bunun icine koyduk.
 */
        //  char ch = chars[0];// A
        //int frequency = 0;

        //   for (int i = 0; i < chars.length; i++) {// once bu loopu yazdik, sonra bu loopiun her element icin
        //    tekrar edilmesi gerektigini dusundugumuz icin  ustteki loopu sonradan ekledik
        //   if (chars[i] == ch) {
        //   frequency++;
        // }


        // }
        //  if (frequency==2){
        //     System.out.println(ch);
        //  }}}}}}

        // benim yazdigim calismadi, hatayi da bulamadim o yizden notlardan asagidakini coppy paste yaptim.
        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j]; //'A'
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] ==ch){
                    frequency++;
                }
            }

            if(frequency == 2){// appeared twice yi yazdigimiz icin frequency ==2 dedik
                System.out.println(ch);
            }

        }



    }}