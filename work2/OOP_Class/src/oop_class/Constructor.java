
package oop_class;

public class Constructor {
    public int n1, n2;
    public String color;
    
    Constructor(int n1, int n2, String color){
        this.n1 = n1; // this -> şu an üzerinde çalıştığım class
        this.n2 = n2;
        this.color = color;
    }
    
    public int total(){
        return this.n1 + this.n2;
    }
    
    public int subtraction(){
        return this.n1 - this.n2;
    }
    
    public int multiplecation(){
        return this.n1 * this.n2;
    }
    
    public int division(){
        return this.n1 / this.n2;
    }
}
