//Exercise 2 : Constructor Chaining
/*
 * @author: N'goran Kouadio Jean Cyrille
 * Date : 29/01/2023
 */
public class Car {
    // we create all attributes of the class
    String make;
    String model;
    int year;
    String color;
    double price;
    // the default constructor
public Car(){
    make = "jkhg";
}
    // The construcor with all parameters
    public  Car(String make, String model, int year, String color, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color =color;
        this.price = price;
    }

}
