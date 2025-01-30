
package Kalıtım_Inheritance;

public class SecurityOfficer extends Officer{
    String document;
    
    SecurityOfficer(String document, String department, int shift, String name_surname, String eposta, String phone){
        super(department, shift, name_surname, eposta, phone);
        this.document = document;
    }
    
    public void bout(){
        
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
