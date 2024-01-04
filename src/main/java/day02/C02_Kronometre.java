package day02;

import java.util.Scanner;

public class C02_Kronometre {

    // 2023 OA INTERWIEW QUESTION

    /*
      KRONOMETRE  2023/04 QA INTERWIEW

    Kullanıcının belirlediği sayıda işlemi gerçekleştiren,
    sonunda toplam süreyi ve
    ortalama süreyi kullanıcıya gösteren bir kronometre
    kodunu yaziniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac kez islem yapilacagini giriniz");
        int numTask = input.nextInt();

        long startTime = System.currentTimeMillis();
        System.out.println("********************************");
        for (int i = 0; i < numTask; i++) {
            int number [] = {1,2,3,4,5};
            int sum = 0;
            for (int w:number) {
                sum = sum + w;

            }
            System.out.println("sum = " + sum);
            System.out.println("Islem " + i + "tamamlandi");
            System.out.println("*****************************");


        }
        long finishTime = System.currentTimeMillis();

        long processTime = finishTime - startTime ;
        System.out.println("processTime = " + processTime);
        System.out.println("ortalama Sure : " + ((double)processTime/numTask) + "milisaniye");




    }


}
