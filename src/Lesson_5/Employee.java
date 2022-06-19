package Lesson_5;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return fullName +", "+ jobTitle +", "+ email +", "+ phoneNumber +", "+ salary +", "+ age;
    }

    public static void main(String[] args) {

        Employee person1 = new Employee("Ivan Ivanov", "worker", "ivan@gmail.up",
                "123456789", 35000, 34);
        System.out.println(person1.toString());

        Employee[] personArr = new Employee[5];
        personArr[0] = new Employee("Vasiliy Vasichkin", "engineer", "Vasia@mail.tu",
                "034893467", 45000, 45);
        personArr[1] = new Employee("Galina Petrovna", "secretary", "gala@tmail.ro",
                "094578312", 49000, 36);
        personArr[2] = new Employee("Roman Klop", "worker", "roma@loop.com",
                "450832785", 43000, 48);
        personArr[3] = new Employee("Rita Selezneva", "general director", "rita@vit.com",
                "123984567", 55000, 38);
        personArr[4] = new Employee("Denis Ermakov", "student", "den@dtf.ro",
                "459034876", 30000, 22);
        for(int i = 0; i < personArr.length; i++){
            if(personArr[i].age > 40){
                System.out.println(personArr[i].toString());
            }
        }
    }
}
