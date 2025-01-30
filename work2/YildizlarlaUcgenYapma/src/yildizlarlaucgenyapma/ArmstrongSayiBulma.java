
package yildizlarlaucgenyapma;

public class ArmstrongSayiBulma {
    public static void main(String[] args){
            
        for(int i = 100; i <= 999; i++){
            int yüzler = i / 100;
            int onlar = (i % 100) / 10;
            int birler = i % 10;
            
            if( (yüzler * yüzler * yüzler) + (onlar * onlar * onlar) + (birler * birler * birler) == i ){
                System.out.println("Üç Basamaklı Armstrong Sayılar : " + i);
            
            }
        }
    }
}
