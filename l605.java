public class l605 {

    public static void main(String[] args) {

        // Instance of Student using default constructor
        Student s1 = new Student();

        // Instance of Student using constuctor 2
        Student s2 = new Student("William Gates", 11, 16);

        // Instance of Student using constructor 3
        Student s3 = new Student("Steven Jobs");

        s1.print();
        s2.print();
        s3.print();

    }

}

class Student {
    String name;
    String password;
    String email;
    String address;
    int age;
    int grade;
    String phone;

    public Student() {
        this.name = "student";
        this.grade = 9;
        this.age = 14;
        this.password = "cb";
    }
    public Student(String n, int g, int a) {
        this.name = n;
        this.grade = g;
        this.age = a;
        this.password = "cb";
    }

    public Student(String n) {
        this.name = n;
        this.grade = 9;
        this.age = 14;
        this.password = "cb";
    }

    public void print(){

        // Prints a chart displaying the student's info

        System.out.println("-------------------------------------------------");
        System.out.println("STUDENT INFO |             ");
        System.out.println("Name         | " + this.name);
        System.out.println("Age          | " + this.age);
        System.out.println("Grade        | " + this.grade);
        System.out.println("Password     | " + this.password);

    }
}