package day31_Constructors;

public class Rectangle {
    /*
create a custom class named Rectangle
    Attributes:
        length, width
    Add a constructor that can set all the fields
    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
     	toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
 */
public double length, width;




    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;


    }

public double calcArea(){
        return  length* width;
}
   public double calcPerimeter() {
        return 2*(length+width);
   }

    public String toString() {// short cut ile toString method yazilirsa sadece length ve width
        // yi yazioyor ama bizden area ve perimeterde isteniyor. shor cut ile ilk kismi yazdirim geri kalanu manual yazdiracagiz
        // bunun icin ", width=" + width + bu line i coppty yapip 2 kere asagida paste yapacahiz cunku hem ara hem de
        // perimeter ekleyebileyim. sonra area ve perimetera cevirecegiz, sanirim coppy paste yapmadan izin vermiyor direk kendimizin yazmasina
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +//length* width, boylede yazilabilir ama zaten yukarida calareada nasil yapilacagini set ettigimiz icin direk onu yazdik
                ", perimeter=" + calcPerimeter() +//2*(length+width)
                '}';
    }
}

