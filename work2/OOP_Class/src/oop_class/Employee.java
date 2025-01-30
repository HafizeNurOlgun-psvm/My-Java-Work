
package oop_class;

public class Employee {
    String name;
    double salary, workHours, hireYear, tax, bonus;
    
    Employee(String name, int salary, int workHours, int hireYear){
       this.name = name;
       this.salary = salary;
       this.workHours = workHours;
       this.hireYear = hireYear;
    }
    
    public double tax(){
        if(this.salary <= 1000){
            return 0;
        } else{
            return ( this.salary * 3 / 100 ); 
        }
    }
    
    public double bonus(){
        if(this.workHours <= 45){
            this.bonus =  0;
        } else if(this.workHours > 45){
            this.bonus =  30 * (this.workHours - 45);
        }
        return bonus;
    }
    
    public double raiseSalary(){
        double raise;
        double totalYear = 2015 - this.hireYear;
        if(totalYear < 10){
            raise = this.salary * 1 / 20;
        } else if(totalYear < 20){
            raise = this.salary / 10;
        } else{
            raise = this.salary * 15 / 100;
        }
        return raise;
    }
}