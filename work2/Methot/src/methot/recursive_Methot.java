
package methot;

public class recursive_Methot {
    public static void main(String[] args) {
        System.out.println(f(4));
    }
    
    static int f(int x){
        if(x == 1){
            return 1;
        }
        
        return x + f(x - 1);
    }
    
}
