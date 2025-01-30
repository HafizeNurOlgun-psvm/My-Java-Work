package Kalıtım_Inheritance;

public class Assistant extends Academician{
    String degree;
    
    Assistant(String degree, String bolum, String mission, String lessons, String name_surname, String eposta, String phone){
        super(bolum, mission, lessons, name_surname, eposta, phone);
        this.degree = degree;
    }
    
    public void introductionToLab(){
        
    }
    
    public void readToQuiz(){
        System.out.print("Quizden geçen olmamıştır...");
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    
}
