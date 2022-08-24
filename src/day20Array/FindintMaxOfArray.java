package day20Array;

public class FindintMaxOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0};
// find out the maximum number in this array
// ilk elementi max number olarak assume yapacagiz sonra bir sonraki elementlerle
        // compare yapa yapa ilerleyecegiz max numberi bulabilene kadar

        int max = numbers[0];// 10, it is just assumtion 


        for (int i = 0; i < numbers.length; i++) {// i is reperesens index numbers
        /*
        array icin for loop yazmanin shor cut i var soyle en yukarida arrayi int olarak ve numbers olarak initiliose ettik
        bu yuzden ***numbers.fori *** yazip enter yaptigimizda bu bize array icin starting from beginning ten end e for loopu verecektir
        array icin for loopu tersten basa dogru yazmasini istiyorsak o zamnada ***numbers.forr*** yazarsakta tersen basa dogru yani last index ten ilk indexe dogru yazan for loopu verir

         */
          //  for (int i1 = numbers.length - 1; i1 >= 0; i1--) {// buda tersten basa

          if(numbers[i]>max){// if there is an element in the array that is greater than  the current
              // max  number

              /*

              if kisminda ilk index number olan 0 ile baslayacak ve soracak kedime ilk index numbere denk gelen
              10 is greaterden 10 no, then  ir sonraki index numbera gececek, 1 index numbere
              denk gelen sayi 10 dasn buyukmu diye soracak kendine, 1 index number 5 yani degil, sonra 2 index , 3 index tek tek kiyaslayarak tektat tekrar sonuna kadar gidecek , 10 dan buyuk  bir numberla karsilas
              tiginda yeni max o buyuk number olacak
               */
              max=numbers[i];// assigning greater number to variable max

              System.out.println(max);




            }

        }


    }
}
