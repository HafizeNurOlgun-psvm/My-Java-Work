
package oop_class;

public class lesson1_Main {

    public static void main(String[] args) {
        // SinifAdi objeAdi = new SinifAdi();
        
        lesson1 hesapMakinesi1 = new lesson1();
        hesapMakinesi1.n1 = 10;
        hesapMakinesi1.n2 = 10;
        System.out.println(hesapMakinesi1.n1 + hesapMakinesi1.n2);
        
        lesson1 hesapMakinesi2;
        hesapMakinesi2 = new lesson1();
        hesapMakinesi2.n1 = 10;
        hesapMakinesi2.n2 = 20;
        System.out.println(hesapMakinesi2.n2 - hesapMakinesi2.n1);
        
    }
    
}
