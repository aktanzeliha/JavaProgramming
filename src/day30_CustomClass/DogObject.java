package day30_CustomClass;
import java.util.ArrayList;
public class DogObject {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lusy";
        dog1.breed = " Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.colour = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();

        //  System.out.println(dog2);// icini doldurmadan dog2 dedigimizde dog1 dan ayri birsey cikiyot ici doldurulmamais ama farkli bir dog dan bahseden dosya cikmis oluytor


        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.colour = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();


    }}
