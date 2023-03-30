import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String adminPass;
        // Create random students 
        String [] names = {"Adam", "Bert", "Cansu", "David", "Ernie"};
        int [] ages = {12, 13, 14, 15, 16};
        String [] addresses = {"123 Happy Lane, Ottawa, ON", "45 Colonel By Dr, Ottawa, ON", "32 Abc Dr, Ottawa, ON"};
        String [] phones = {"613-555-3333", "613-555-3333", "613-555-2312"};


        Student [] students = new Student[3];

        for(int i = 0; i < 3; i++){
            students[i] = new Student();
            students[i].name = names[i];
            students[i].age = ages[i];
            students[i].address = addresses[i];
            students[i].phone = phones[i];
            students[i].email = names[i]+"mom@gmail.com";
            students[i].setStudentPassword();
        }

        // Print student passwords if adminPass ='admin'
        for (int x=0; x<3; x++){
            adminPass = s.nextLine();
            System.out.println("Password check - student " +(x+1) +" : " + students[x].getStudentPassword(adminPass));   
    }}
}
class Student {
    public String name, address, phone, email, password;
    public int age;
    public static void displayContact(Student s){
        s.printContact();
    }
    public void printContact(){
        System.out.println(name + " : " + phone);
    }
    public void setStudentPassword() {
        this.password = String.valueOf(this.name.charAt(1)) + String.valueOf(String.valueOf(age).charAt(1))
                + String.valueOf(address.charAt(0)) + this.phone.substring(3, 6);
    }
    public String getStudentPassword(String adminPass) {
        return (adminPass.equals("admin")) ? this.password : "invalid";
    }
}