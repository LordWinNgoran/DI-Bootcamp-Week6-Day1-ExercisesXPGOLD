public class Student {
    private String name;
    private int age;
    private String course;
    private char grade;

    public Student() {
        this.name = "Lordwin James";
        this.age = 25;
        this.course = "ANGULAR/JAVA";
        this.grade = 'B';
    }

    public Student(String name, int age, String course, char grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

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
