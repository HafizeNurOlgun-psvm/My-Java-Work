package com.mycompany.oop;

public class encapsulation_sarmalama {

    public String name, author, pulisher;
    private int numberOfPage;

    encapsulation_sarmalama(String name, String author, String pulisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.pulisher = pulisher;
        if (numberOfPage < 1) {
            this.numberOfPage = 1;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }

    public int getnumberOfPage() {
        return this.numberOfPage; //Source > Insert Code > Getter > İstenilen değişken seçilir.
                                  //numberOfPage 'private' olduğu için onu get methodunu kullanarak ekrana yazdırabiliriz.
                                  //Methot'un isimlendirilme jargonu bu şekildedir.
    }

    public void setnumberOfPage(int value) {
        if(numberOfPage < 1){                   //Source > Insert Code > Setter > İstenilen değişken seçilir.
            this.numberOfPage = 1;              //numberOfPage 'private' olduğu için normalde değişklik yapılamaz, ama bu methot sayesinde yapılır.
        } else{
            this.numberOfPage = value;
        }                     
    }
}
