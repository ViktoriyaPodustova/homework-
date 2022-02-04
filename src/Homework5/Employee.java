package Homework5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    public Employee(
            String fullName,
            String position,
            String email,
            String phone,
            long salary,
            int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    void printData(){
        System.out.println("1. Full Name: "+ fullName);
        System.out.println("2. Position: "+ position);
        System.out.println("3. E-mail: "+ email);
        System.out.println("4. Phone: "+ phone);
        System.out.println("5. Salary: "+ salary);
        System.out.println("6. Age: "+ age);
    }

    int getAge() {
        return age;
    }

}
