
package stringmethods;

public class StringMethods {
    public static void main(String[] args) {
        //String aslında karakterlerin birleşimidir. O yüzden kendisine has methodları vardır.
        char[] character = {'H', 'E', 'L', 'L', 'O'};
        String word = new String(character);
        System.out.println(word);

        
    String deneme = "Merhaba"; 
        
        
    // Sıfırdan başlayarak, belirli bir harfi elde etmek için 
    System.out.println(deneme.charAt(5)); 

 
    // Belirtilen ifadenin, String içeriğinde olup-olmadığını kontrol etmek için 
    System.out.println(deneme.contains("Mer")); 


    // String içeriğinin son kısmı, belirtilen ifade ile mi bitiyor? 
    System.out.println(deneme.endsWith("haba")); 

 
    // String içeriğinin baş kısmı, belirtilen ifade ile mi başlıyor? 
    System.out.println(deneme.startsWith("Mer")); 

 
    // String ifade, belirtilen ifade ile eşit mi? 
    System.out.println(deneme.equals("Merhaba")); 

    // İlk bulunan rh ifadesinin konumunu verir. 
    System.out.println(deneme.indexOf("rh")); 

 
    // Son bulunan ab ifadesinin konumunu verir. 
    System.out.println(deneme.lastIndexOf("ab")); 

 
    // deneme değişkenindeki String ifade karakter içeriyor mu? boş mu? 
    System.out.println(deneme.isEmpty()); 

 
    // String ifadenin toplam karakter sayısını döndürür. 
    System.out.println(deneme.length()); 

 
    // String ifade içerisinde değişiklik yapar. 
    System.out.println(deneme.replace("Merh", "Ar")); 


    // String ifadenin tüm harflerini büyük yapar. 
    System.out.println(deneme.toUpperCase()); 

 
    // String ifadenin tüm harflerini küçük yapar. 
    System.out.println(deneme.toLowerCase()); 

    // String ifadenin başındaki ve sonundaki boşlukları siler. 
    System.out.println(" deneme ".trim()); 
    }
    
}
