
package Kalıtım_Inheritance;

public class Teacher extends Academician{
    String title;
    
    Teacher(String title, String bolum, String mission, String lessons, String name_surname, String eposta, String phone){
        super(bolum, mission, lessons, name_surname, eposta, phone);
        this.title = title;
    }
    
    public void joinToMeeting(){
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
