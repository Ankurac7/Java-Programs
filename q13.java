class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary(){
        System.out.println("Salary: " +salary);
    }
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

public class q13{
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.name = "Ankur";
        employee.age = 20;
        employee.phoneNumber = "9838926849";
        employee.address = "Kolkata, India";
        employee.salary = 8500.0;
        employee.specialization = "Java Developer Intern";

        Manager manager = new Manager();
        manager.name = "Sandip";
        manager.age = 34;
        manager.phoneNumber = "9846937593";
        manager.address = "Kharagpur, India";
        manager.salary = 170000.0;
        manager.department = "Dept. of CSE";

        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);
        System.out.println("===================================================");
        System.out.println("Manager:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}