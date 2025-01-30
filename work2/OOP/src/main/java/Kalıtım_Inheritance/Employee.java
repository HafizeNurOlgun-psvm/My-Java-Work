
package Kalıtım_Inheritance;

public class Employee {
    String name_surname, eposta, phone;

    Employee(String name_surname, String eposta, String phone) {
        this.name_surname = name_surname;
        this.eposta = eposta;
        this.phone = phone;
    }
      
    public void employee(){ // protected yazarsak eğer sadece subclass'larda kullanılabilir bir metot olduğunu gösterir.
        System.out.println("Süpersiniz, tebrikler.");
    }

    public String getName_surname() {
        return name_surname;
    }

    public String getEposta() {
        return eposta;
    }

    public String getPhone() {
        return phone;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
