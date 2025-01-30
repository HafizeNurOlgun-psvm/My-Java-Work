
package Kalıtım_Inheritance;

public class Academician extends Employee{
    String bolum, mission, lessons;

    Academician(String bolum, String mission, String lessons, String name_surname, String eposta, String phone) {
        super(name_surname, eposta, phone); //Employee class'ının acamdemician'ı kullanabilmesi için yapılır.
        this.bolum = bolum;
        this.mission = mission;
        this.lessons = lessons;
    }
    
    public void introductionToClass(){
        System.out.print("Sınıfa giriş yapılmıştır.");
    }

    public String getBolum() {
        return bolum;
    }

    public String getMission() {
        return mission;
    }

    public String getLessons() {
        return lessons;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }
}
