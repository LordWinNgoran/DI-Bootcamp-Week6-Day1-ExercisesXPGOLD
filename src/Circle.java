//Exercise 1 : Circle Constructor
/*
 * @author: N'goran Kouadio Jean Cyrille
 * Date : 29/01/2023
 */


//1 Design a class named Circle.
public class Circle {
    public  double radius;

    //4 A no-arg constructor set the default value of radius to 1.
    public Circle(){
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    //5 A getArea() function is used to return the area of circle.
    public static double getArea(double radius){
        return 3.14*(radius*radius);
    }

    public static void main (String[] args){
        //2 Construct three circle objects with radius 2.0, 12, and 24
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle(24);
        //3 Display the radius and area of each.
        System.out.println(getArea(circle1.radius));
        System.out.println(getArea(circle2.radius));
        System.out.println(getArea(circle3.radius));
    }


}
