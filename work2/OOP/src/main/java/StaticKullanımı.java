
public class StaticKullanımı {
    public String name;
    public int id;
    private static int counter = 0;
    
    StaticKullanımı(String anme, int id){
        this.name = name;
        this.id = id;
        StaticKullanımı.counter++;
    }
    
    public void exit(){
        StaticKullanımı.counter--;        
    }
    
    public static int howMuchStudent(){
        return StaticKullanımı.counter;
    }
    
    public static double calcOverall(int[] array){
        double overall = 0;
        for(int i = 0; i < array.length; i++){
            overall += array[i];
        }
        
        return overall / array.length;
    }
}
 