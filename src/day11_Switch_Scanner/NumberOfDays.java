package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        //int num= 2;
        //String result =" ";
/*
 number of days:
 28 days=2
 30 days= 4,6,9,11
 31 days= 1,3,,5,7,8,10,12
 output olarak yukaridakilerin cikmasini bekliyoruz,

 */

//switch(num ){
    /*case 1:
        result =" 31 Days";
        break;
    case 2:
        result =" 28 Days";
        break;
    case 3:
        result= " 31 Days";
        break;
    case 4:
        result= " 30 Days";
        break;
    case 5:
        result=" 31 Days";
        break;
    case 6:
        result=" 30 Days";
        break;
    case 7:
        result =" 31 Days";
        break;
    case 8:
        result=" 31 Days";
        break;
    case 9:
        result = " 30 Days";
        break;
    case 10:
        result=" 31 Days";
        break;
    case 11:
        result= "30 Days ";
        break;
    case 12:
        result= " 31 Days";
        break;
    default:
        result=" invalid ";
*/

/*
system out u switch in curly parentesiznden sonra yazmayi unutma.
 */
        // System.out.println(result);
/*
31 ceken aylarin hepsinin sonucu 31 days ve 30
ceken ayalarin heosinin sonucuda 30 days  cikacagi icin
bunklar icin arka arkaya case yazabilirim araya result yada break eklemeden
 */
int num= '2';
String result= " ";
switch( num){
    case 4: case 6: case 9: case 11:
        result = "30 Days";
        break;
   // case 1: case 3: case 5: case 7: case 8: case 10: case 12: bunun yerine
    // default yazabiliriz cunku 28 degil 31 dadegilse geriye tek option kaliyor oda 30 gun.
    // ama default tu  burada kullanacaksak
      //  result = " 31 Days";
        //break;
    default:
        result=" 28 Days";
}
        System.out.println(result);
    } }

// ikincisi daha kisa yolu, ayni sonuc cikiyor
/*
int year = 2000;// buradan asagisini coppy paste yaptim.
//bu sekilde de yapilabiliyor, subat bazen 29 cektigi icin bu yontem saha dogru

        int number = 2;

        String result = "";

        if(number >= 1 && number <= 12){ // number: 1~12

            switch (number){
                case 2:
                   result = (year % 4 ==0)? "29 days" : "28 days";
                    break;

                case 4: case 6: case 9: case 11:
                   result = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    result = "31 days";
            }

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);


    }

}

/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */


