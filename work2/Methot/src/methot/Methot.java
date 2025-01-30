
package methot;

public class Methot {

    public static void main(String[] args) {
            f(3);
        power(2,3);
    }
    
    static void f(int x){
        int sonuc = (x + 2) * 6;
        System.out.println(sonuc);
    }
    
    static void power(int number1, int number2){
        int sonuc = 1;
        for(int i = 1; i <= number2; i++){
            sonuc *= number1;
        }
            System.out.println(sonuc);
    
    }
    }
    

