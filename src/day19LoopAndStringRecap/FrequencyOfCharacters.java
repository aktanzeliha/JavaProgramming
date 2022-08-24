package day19LoopAndStringRecap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";//a2b1c3d1= bu sonuc ciksin istiyoruz en sonunda

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);// each charaacer from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) {// to find the frequency for each character

                char each = str.charAt(i);//each character of string
                if (ch == each) {
                    count++;
                }

            }
            if(result.contains(""+ch)){
                continue;// burada parentez icinded "" vermezsek rror veriyor cunku char contains kullanmamiza izin vermiyor sadece string de kullanailabiliyor contains
            }
                // ch nin basina "" koyarak chari stringe cevirmis oluyoruz
            result += ch;
            result += count;
        }
        System.out.println(result);
    }}


