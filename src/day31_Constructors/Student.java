package day31_Constructors;

public class Student {
    public String name;
    public  int age;
    public  char gender;
    public  char grade;
    public int Id;

    public Student(String name, int age, char gender, char grade, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        Id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", Id=" + Id +
                '}';
    }
}
