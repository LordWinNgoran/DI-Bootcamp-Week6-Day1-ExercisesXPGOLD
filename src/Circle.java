public class Circle {
    public  double radius;
    public Circle(){
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }


    public static double getArea(double radius){
        return 3.14*(radius*radius);
    }

    public static void main (String[] args){
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle(24);
        System.out.println(getArea(circle1.radius));
        System.out.println(getArea(circle2.radius));
        System.out.println(getArea(circle3.radius));
    }


}
