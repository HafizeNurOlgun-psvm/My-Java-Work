
package methot;

public class overloading_Methot {
    public static void main(String[] args) {
        System.out.println(toplam1(5, 6));
        System.out.println(toplam1(9, 8, 0));
        System.out.println(toplam1(5, 6, 9.8));
    }
    
    static int toplam1(int a, int b){
        int sonuc = a + b;
        return sonuc;
    }
    
    static int toplam1(int a, int b, int c){
        int sonuc = a + b + c;
        return sonuc;        
    }
    
    static double toplam1(int a, int b, double c){
        double sonuc = a + b + c;
        return sonuc;        
    }
    
}
