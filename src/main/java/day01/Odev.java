package day01;

import java.util.Scanner;

public class Odev {

    /*
    ================== RUSSULETI ======================
        Birbirleriyle çarpılacak sayılar yan yana yazılır.
        ilk sayı ikiye bölünür ve sonuç hemen altına yazılır.
        sonuç küsuratlı(kesirli) çıktıysa kesir kısmıyla ilgilenilmez
        sadece tam sayı kısmı yazılır. diğer sayı ise ikiyle çarpılır
        ve sonuç hemen altına yazılır. bu işlem yeni sayılar için tekrarlanır,
        ta ki ilk sayı ikiye bölüne, bölüne 1(bir) değerine ulaşana kadar.
        birinci sütundaki çift sayıların ikinci sütundaki karşılıkları silinir.
        toplandığında elde edilen sonuç istenilen sayıdır.
            örnek:        456 x 219 = ? 99864

                        456........219
                        228........438
                        114........876
                        57 ........1752
                        28 ........3504
                        14 ........7008
                        7  ........14016
                        3  ........28032
                        1  ........56064
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen carpmak istediginiz iki sayiyi yaziniz...");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int result = 0;


        for (int i = sayi1; i >0;i=sayi1/2 ){
            if (sayi1%2!=0){
                result+=sayi2;
           sayi1 = sayi1/2;
           sayi2 = sayi2*2;

            }
        }
        System.out.println("result = " + result);

        //ikinci yol


        carpim(sayi1, sayi2);
        System.out.println(carpim(sayi1, sayi2));
    }

    public static int carpim(int sayi1, int sayi2) {
        boolean negatif = false;
        if(sayi1<0){
            sayi1 = -sayi1;
            negatif = !negatif;
        }
        if (sayi2<0){
            sayi2 = -sayi2;
            negatif = !negatif;
        }

        int toplam = 0;
        do {

            if (sayi1%2!=0){
                toplam+=sayi2;

                sayi1 = sayi1/2;
                sayi2 = sayi2*2;
            }
        }while (sayi1>=1);

        if(negatif){
            toplam = - toplam;
        }
        return toplam;
    }

}

