package day04;

import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {

        start();


    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        boolean isFail;
        do {
           isFail = false;

            System.out.println("Lutfen tarife donemini giriniz" +
                    "\n1==>Haziran 2023\n2==>Aralik 2023");
            int term = 0;
            try {
                term = input.nextInt();
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz");
                start();
            }

            if (term == 1 || term == 2) {

                Arac arac = new Arac();
                System.out.println("Lutfen arac tipini giriniz:\n" +
                        "otomobil kamyon otobus veya motosiklet");
                arac.type = input.next().toLowerCase();
                arac.prim = arac.countPrim(term);

                String termName = term == 1 ? "Haziran 2023" : "Aralik 2023";
                if (arac.prim > 0) {
                    System.out.println("Hesaplama basariyla tamamlandi.");
                    System.out.println("Arac tip: " + arac.type);
                    System.out.println("Tarife donemi: " + termName);
                    System.out.println("Aracinizin sigorta prim odemesi: " + arac.prim);
                    arac.islemTercih();
                } else {
                    System.out.println("Hesaplama basarisiz..");
                    arac.islemTercih();
                }

           } else {
                System.out.println("Hatali giris yaptiniz");
                isFail = true;
           }
        } while (isFail);

       }


    }








