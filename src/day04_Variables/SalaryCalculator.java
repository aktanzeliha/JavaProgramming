package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
    // hourly Rate, weeklyHourse


      int hourlyRate =50;
      int weeklyHours =40;
      int numberOfWeeks=52;
      int salary = hourlyRate * weeklyHours * numberOfWeeks;
        System.out.println(salary);

/*
 sout la baslayan kisimda artik "" kullanmiyoruz parantes icinde cunku
 '' kullanmak demek oraya ne yazdiysak onu print yapsin istiyorum demek, ama
 '' kullanmadigimda parantez icindeki islemi yapsin istiyorum salary yazsin istemiyorum demek o yuzden
 '' kullanmadik
 */
    //System.out.println(salary)
       // salary nin short cut i "soutv" "v" stand for variable,
        System.out.println("salary = $" + salary);
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);



    }







}
