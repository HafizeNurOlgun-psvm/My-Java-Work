
public class StaticKullanımı_Main {
    public static void main(String[] args){
        System.out.println("Öğrenci Sayısı : " + StaticKullanımı.howMuchStudent());
        StaticKullanımı s1 = new StaticKullanımı("Ayşe", 220);
        StaticKullanımı s2 = new StaticKullanımı("Ahmet", 330);
        StaticKullanımı s3 = new StaticKullanımı("Fatma", 440);
        System.out.println("Öğrenci Sayısı : " + StaticKullanımı.howMuchStudent()); 
        s1.exit();
        System.out.println("Öğrenci Sayısı : " + StaticKullanımı.howMuchStudent()); 
        
        int[] points = {100, 90, 80};
        System.out.println("Not Ortalaması : " + StaticKullanımı.calcOverall(points)); 

    }
}