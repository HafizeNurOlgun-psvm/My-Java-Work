
package com.mycompany.oop;

public class encapsulation_sarmalama_Main {
    public static void main(String[] args){
        encapsulation_sarmalama book = new encapsulation_sarmalama("Harry Potter", "Rowling", "BKM", 500);
        book.getnumberOfPage();
        book.setnumberOfPage(900);
        book.getnumberOfPage();
    }
    
}