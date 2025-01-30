package oop_class;
public class Employee_Main {
    public static void main(String[] args){
        Employee e1 = new Employee("Hafize Nur" , 3000, 50, 1010);
        
        System.out.println("Name : " + e1.name);
        System.out.println("Salary : " + e1.salary);
        System.out.println("Work Hours : " + e1.workHours);
        System.out.println("Hire Year : " + e1.hireYear);
        System.out.println("Tax of Salary: " + e1.tax());
        System.out.println("Bonus   : " + e1.bonus());
        System.out.println("Reise of Salary : " + e1.raiseSalary());  
        System.out.println("Result of Salary : " + ( e1.raiseSalary() + e1.salary + e1.bonus() - e1.tax() ));  
    }
}
