
package com.mycompany.oop;


public class accessModifiers {
    public String carName; // carName farklı package'lerde kullanılır halde olurlar.
    private int carAge; // carArge değiştirilemeyecek bir değişken olur ve hiçbir java class carAge'e erişemez.
    protected String carColor; // carColor sadece bulunduğu package'de kullanılır halde olurlar.
    
    accessModifiers(){
        this.carAge = 20;
        this.carColor = "Black";
        this.carName = "Ford";
    }
    
    private void print(){
        System.out.print(carAge);
    }
    
    public void run(){
        print();
    }
}
