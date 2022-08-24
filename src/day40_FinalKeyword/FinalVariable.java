package day40_FinalKeyword;

public class FinalVariable {

    final  String birthday;
    final static String name;

    static {
        name= " Batch 25";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {


       final  double pi = 3.14;

        // pi = 4.14; final variable in degeri yeniden degistirilemez

        // pi= 5.4;

        final String name;
        name= " Java";

        //name= " Wooden Spoon"; you can not cahande it because yukarida final dedik
        System.out.println(name);

        System.out.println("==========================");

        FinalVariable obj = new FinalVariable("May/01");

        //obj.birthday = " June//01";// final variable can not assigned again

        System.out.println(obj.birthday);

        System.out.println("=================");

       // FinalVariable.name =" PYTHON"; you can reassigned variable

        System.out.println(name);

    }
}
