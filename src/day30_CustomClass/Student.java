package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

   /* public void setInfo(String name, char gender, int age,int ID, char grade){
     this.name= name;
     this.gender=gender;
     this.age=age;
     this.ID=ID;
     this.grade=grade;*/
     /*
     yukarida this. kullanmamizin sebebi local variable ile yukarida publick String
     dedigimiz yerlerdeki variablelerimiz ayni yani ikiside name, ikiside gender, ikiside age vs
     ama bizim bu sisitemi genel olarak, yanoi baska ogrenciler icinde calistirabilmemeiz icin
     en yukaridaki yazilan name, age, gender .... kullnamaiz lazim. basina this yazip nokta koydugunuzda
     bize en yukaridaki tanimlatmis oluyor. this.age=age dedigimizde this in yanindaki age
     en yukaruda verilen age ve esittirden sonraki age de setInfo nun icindeki age olmus oluyor
      ariableler ayni degilde this. kullanmaya gerek yok
      */
        /*
        setInfo ile this.grade=grade arasinin bir shotr cut i var
        right click, go to generate nd clicl Constructor, sleck by one by. commang a yaparsan hepsini seleck yapiyor ,  and click Ok button,
        bas kismini public void seInfo olarak degistir, bu otomatik olarak this.age vs yazmis oluyor
         */

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
        /*
        bu hemen bir yukaridakini de short cut ile yaptik, right click, seleck generate
        sonra seleck toString then Ok .
         */
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


}



