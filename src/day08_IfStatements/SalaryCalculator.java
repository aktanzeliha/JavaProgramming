package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

    // int hourlyRate=   50;
    // int weeklyHours= 45;
   /* birkac seyi declare etmem gerektiginde
    ayri ayri int yazmama gerek yok, 50 den
    sonra noktali virgul yerine sadece virgul
    koyup tekrara int yazmadan weeklyHours
    yazarsam tek data type ile 2 farkli seyi
    declare edebiliyorum.   */

int hourlyRate = 50, weeklyHours = 45;// boyle yani
  double stateTaxRate = 6.5,
       federalTaxRate = 26.2;
  // double stateTaxRate =6.5;
    //    double federalTax = 26.2; bu sekilde ayri ayrida
        //    yazilabilirdi ama ben araya virgul koyup tek
        //    cumlede yazmak istedim.

int salaryBeforeTax= hourlyRate*weeklyHours*52;
double stateTax= salaryBeforeTax* stateTaxRate /100;// state rate 6.5% oldugu icin bunu 6.5/100 seklinde carpiyor
     //   o yuzden 100 e boluyor, ayni sekilde federal tax rate de 26.2%, carparken o degeride
        //   26.2/100 seklinde yazip carpmak zorunda
 double federalTax= salaryBeforeTax* federalTaxRate/ 100;
 double totalTax= stateTax+ federalTax;
 double salaryAfterTax= salaryBeforeTax-totalTax;
        System.out.println("Gross pay is: $ " + salaryBeforeTax);
        System.out.println("State Tax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("Net income = $" + salaryAfterTax);
        System.out.println("totalTax = $" + totalTax);






    }









}
