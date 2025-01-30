
package Kalıtım_Inheritance;

public class Officer extends Employee{ //Üst class'a erişebilmek için extends yazdım.
    String department;
    int shift;
    
    Officer(String department, int shift, String name_surname, String eposta, String phone){
        super(name_surname, eposta, phone); //Üst class'ların erişebilmesi için bu kısım eklenmeli.
        this.department = department;
        this.shift = shift;
    }
    
    public void work(){
        
    }

    public String getDepartment() {
        return department;
    }

    public int getShift() {
        return shift;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
    
    
}
