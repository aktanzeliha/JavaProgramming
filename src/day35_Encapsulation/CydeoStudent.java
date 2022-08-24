package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudent;



    public static String schoolName;
    public static String programingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudent) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudent = fieldOfStudent;
    }


    static {
        schoolName = "Cydeo";
        programingLanguage= "Java";
        secretCode= "Wooden Spoon";

    }

    public static  void printProgramingLanguage(){
        System.out.println("programingLanguage = " + programingLanguage);
    }


    public static void printSchoolName(){
        System.out.println("schoolName = " + schoolName);

    }

public static void printSecretCode(){
    System.out.println("secretCode = " + secretCode);

}


public void attendClass(){
    System.out.println(name + "is attending class. ");

}
public void study (){
    System.out.println( name+ " is studying.");
}

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudent='" + fieldOfStudent + '\'' +
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */