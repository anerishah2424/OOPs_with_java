
package PDEU.drawing;


abstract class Shape{
    String color;
    String pattern;
    static int count;

    abstract double calculateArea();
    abstract double calculateperimeter();
    static int countShape(){
        return count++;
    }

}

class Square extends Shape{
    double side;
    public Square(double side){
        this.side=side;
    }
    public double calculateArea(){
        return side*side;

    }
    public double calculateperimeter(){
        return 4*side;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;

    }
    public double calculateperimeter(){
        return 2*3.14*radius;
    }
}

class Triangle extends Shape{
    double length;
    double height;
    double side1;
    double side2;
    double side3;
    public Triangle(double length,double height,double side1,double side2,double side3){
        this.length=length;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double calculateArea(){
        return 0.5*length*height;

    }
    public double calculateperimeter(){
        return side1+side2+side3;
    }
}
public class Resize {
    public static void main(String args[]){
        Shape s1=new Square(20);
        System.out.println(s1.calculateArea());
        System.out.println(s1.calculateperimeter());

    }
    
}