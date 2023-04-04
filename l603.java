import java.util.*;

/*
 *    Student Instance Methods
 */

public class l603 {

    public static void main(String[] args) {
        // Create random students
        String[] names = { "Adam", "Bert", "Cansu", "David", "Ernie" };
        int[] ages = { 12, 13, 14, 15, 16 };
        String[] addresses = { "123 Happy Lane, Ottawa, ON", "45 Colonel By Dr, Ottawa, ON", "32 Abc Dr, Ottawa, ON" };
        String[] phones = { "613-555-3333", "613-555-3333", "613-555-2312" };

        Student[] students = new Student[4];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            students[i].name = names[i];
            students[i].age = ages[i];
            students[i].address = addresses[i];
            students[i].phone = phones[i];
            students[i].email = "enter";
            students[i].setStudentPassword();
        }

        // Set student 0 email info
        students[0].email = "mom@gmail.com";

        // Test instance methods
        students[3] = new Student();
        students[3].name = names[3];
        students[3].age = ages[3];
        students[3].copyHomeInfo(students[0]);
        students[3].setStudentPassword();

        // Print all student info
        for (int x = 0; x <= 3; x++) {
            students[x].print();
        }

        // test checkPassword
        System.out.println("Password check:  " + students[0].checkPassword("no"));
        String pass = students[0].password;
        System.out.println("Valid password check: " + students[0].checkPassword(pass));

    }

}

class Student {
    String name;
    String password;
    String email;
    String address;
    int age;
    String phone;

    public void print() {
        // Prints a chart displaying the student's info
        System.out.println("-------------------------------------------------");
        System.out.println("STUDENT INFO |             ");
        System.out.println("Name         | " + name);
        System.out.println("Age          | " + age);
        System.out.println("Password     | " + password);
        System.out.println("---------------------------");
        System.out.println("CONTACT INFO |             ");
        System.out.println("Address      | " + address);
        System.out.println("Phone        | " + phone);
        System.out.println("Email        | " + email);
        System.out.println("-------------------------------------------------");

    }

    public void setStudentPassword() {
        this.password = String.valueOf(this.name.charAt(1)) + String.valueOf(String.valueOf(age).charAt(1))
                + String.valueOf(address.charAt(0)) + this.phone.substring(3, 6);
    }

    public boolean checkPassword(String password) {
        return (this.password == password);

    }

    public void copyHomeInfo(Student other) {
        this.address = other.address;
        this.phone = other.phone;
        this.email = other.email;
    }
}
