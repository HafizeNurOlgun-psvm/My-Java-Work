
package Kalıtım_Inheritance;

public class Main {
        public static void main(String[] args){ 
            Employee employee = new Employee("Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            Academician academician = new Academician("HR", "GetToComputer", "Math", "Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            Officer officer = new Officer("Human Res.", 7000, "Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            Assistant assistant = new Assistant("Yes", "HR", "GetToComputer", "Math", "Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            Teacher teacher = new Teacher("HR Intern", "HR", "GetToComputer", "Math", "Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            SecurityOfficer securityOfficer = new SecurityOfficer("DepartmanAdi", "Human Res.", 7000, "Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            Computing computing = new Computing("MakeMakeUp","Human Res.", 7000, "Hafize Nur Olgun", "hafizenurolgun@icloud.com", "55151");
            
            employee.employee();
            assistant.introductionToClass();
        }
}
