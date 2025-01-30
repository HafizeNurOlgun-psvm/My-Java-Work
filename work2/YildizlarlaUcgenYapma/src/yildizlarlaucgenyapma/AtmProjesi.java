
package yildizlarlaucgenyapma;

import java.util.Scanner;

public class AtmProjesi {
     public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        int bakiye = 10000;
        while( bakiye > 0 ){
            System.out.println("\t1) Bakiye Çekmek \n\t"
                    + "2) Para Yatırmak \n\t"
                    + "3) Bakiye sorgula \n\t"
                    + "4) Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi tuşlayınız : ");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Çekmek istediğiniz bakiyeyi giriniz : ");
                    int cekilen = scan.nextInt();
                    bakiye = bakiye - cekilen;
                    System.out.println("Güncel bakiyeniz : " + bakiye);
                    break;
                    
                case 2:
                    System.out.print("Yatırmak istediğiniz bakiyeyi giriniz : ");
                    int yatirilan = scan.nextInt();
                    bakiye = bakiye + yatirilan;
                    System.out.println("Güncel bakiyeniz : " + bakiye);
                    break;
                    
                case 3:
                    System.out.println("Güncel bakiyeniz : " + bakiye);
                    break;
                    
                case 4:
                    System.out.println("Bizi tercih ettiğiniz için teşekkürler. Mutlu günler dileriz...");
                    break;
                    
                default:
                    System.out.print("Geçerli tuşlama yapınız : ");
                    input = scan.nextInt();
                    break;
            }
            
            if(input != 4){
                System.out.print("Yapmak istediğiniz başka işlem  varsa 1'i yoksa 2'yi tuşlayınız  : ");
                int cik = scan.nextInt();
            
                if ( cik == 2 ){
                    System.out.println("Bizi tercih ettiğiniz için teşekkürler. Mutlu günler dileriz...");
                    break;
                }
            
                else if( cik != 1 ){
                    System.out.print("Geçerli tuşlama yapınız : ");   

                }
            }
            
        }
     }
}
