
package Kalıtım_Inheritance;

public class Computing extends Officer{
    String mission;
    
    Computing(String mission, String department, int shift, String name_surname, String eposta, String phone){
        super(department, shift, name_surname, eposta, phone);
        this.mission = mission;
    }
    
    public void tarama(){
        
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
    
    
}
