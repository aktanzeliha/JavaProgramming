package day30_CustomClass;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String colour;

public  void  setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
    name= dogName;
    breed= dogBreed;
    age =dogAge;
    gender =dogGender;
    size = dogSize;
    colour = dogColor;
}


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }


    public void drink() {
        System.out.println(name + " is drinking");
    }

    //public String toString() {// bu string method olmadan sisitem yazdigin
    // seylerin ekranda cikmasina izin vermiyor
    //   return "Name =" + name;// bu sadce name i yazdirmak


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';





    }


}


















/*
Attributes:
names, age, gender, breed, size, colour

Actions:

eat(), play(). bark()...
 */