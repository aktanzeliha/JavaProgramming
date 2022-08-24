package day18NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
// "wooden Spoon" u 5 times yazsin istiyoruz

        for (int i = 0; i <5 ; i++) {
            System.out.println(" Wooden Spoon ");
// ama wooden soone u 20 kere yazmasini istiyorsak anlamadim ama loop icinde tekrar tekrara loopu tekrarladi

        }

        for (int i = 0; i <5 ; i++) {


            System.out.println(" Wooden Spoon ");

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(" Wooden Spoon ");

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(" Wooden Spoon ");
// bu sekilde 20 kere yazilmis oldu, ayni loopu 4 times repeat ettirmek yerine nested loop kullaniyoruz
        }

        System.out.println("==================");
        // simdi loop icinde loop kullanarak wooden Spoonu 20 kere yazdiracagiz

        for (int i = 0; i <4 ; i++) {// 0,1,2,3 burasi toplamda 4 kere tendini tekrar edecek

            for (int j = 0; j < 5 ; j++) {// 0,1,2,3,,4
        // usteki for loop her calistiginda onun altindaki loop 5 kere calisacak, usteki loop 1 conditionunu dogruladiginda onun
        // altindaki loop 5 kere daha calisacak, sonra yukaridaki loop 2 conditionunu dogruladiginda, onun altindaki loop bir 5 kere daha wppden Spoon yazacak ve
                // boyleliklle toplamada 20 deva wooden spoon yazilmis olacak
                System.out.println("Wooden Spoon");
//*** peki 20 degilde 100 tane Wooden Spoon yazdirmak istesek o zamanda   for (int i = 0; i <4 ; i++) burada i< 20 yazardik, bu loop toplamada 0 sadil 20 kere conditionnu dogrulayacak ve
          //      bu loop her conditionunu dogruladiginda onun altindaki loop 5 kere wooden spoon yazacak bu sekilde ytoplamda 100 defa yazilmis olacak
            }

        }
    }
}
