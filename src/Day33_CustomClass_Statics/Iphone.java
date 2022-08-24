package Day33_CustomClass_Statics;

public class Iphone {
    public static String brand = "Apple";// butun Iphoneler Apple oldugu icin Static olarak declare edildi
    // degismeyecek cunku

    public String model;// her phone icin degisecek bu yuzden Static yazamayiz
    public double price;// sama with model, yani Static olarak declare edemeyiz praice degisik degisiktir

    public static String OS = "iOS";// her iphonenin operatin g Systemi IOS, BU
   // yuzden Static yazdik, telefondan telefona degismeyecek

    public String color;// degisir

    public String size;// degisir

    public static String madeIn = "China";// degismiyor hepsi Chionada uretiliyor

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }



}
