//Exercise 3 : Constructor Overloading
/*
 * @author: N'goran Kouadio Jean Cyrille
 * Date : 29/01/2023
 */
public class Student {
    // all attributes of the Student class
    private String name;
    private int age;
    private String course;
    private char grade;

    //default constructor initialize
    public Student() {
        this.name = "Lordwin James";
        this.age = 25;
        this.course = "ANGULAR/JAVA";
        this.grade = 'B';
    }

    //Constructor with parameters
    public Student(String name, int age, String course, char grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    //A method to display Student Info
    public void displayStudentInfo() {
        System.out.println("Name: " + this.name +
                " Age: " +
                this.age +
                " Course: " +
                this.course +
                " grade: " +
                this.grade);
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("Yao kouassi", 28, "SECURITY", 'B');
        student.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
