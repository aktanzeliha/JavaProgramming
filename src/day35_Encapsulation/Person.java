package day35_Encapsulation;

public class Person {
    public String name;
    public int age;// herkesin yasi farklidir bu uzdeb static olamaz
    public char gender;// degisiktir
    public String language;// herkes farkli bir dil konusuyor olan=bilir o yuzden static yapamayiz bunu

    public static String planet;// sadece bir planet var o yuzden static tir bu
    public static boolean isHuman, hasNose;// static olmak zorunda herkesin burnu var ve herkes insan
    public static int numberOfWings, numberOfHead;// every single person has zero wing and 1 head so static olamk zorunda
    //kisiden kisiye degismiyor yani sonuc
    // sonuc kisiden kisiye degismiyorsa static li yaziyoruz


    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }// YUKARIDAKININ SHORT CUT I SAG TIKLA , GENERATE TIKTA, CONTRACTORU Y=TIKLA HEPSINI SEC


    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }


}

/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */

