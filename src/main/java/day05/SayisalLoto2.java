package day05;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayisalLoto2 {

    public static void main(String[] args) {
        startLoto();
    }

    public static void startLoto() throws CustomExeption   {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 0 ile 49 arasinda 6 adet sayi giriniz...");
        int[] ticket = new int[9];

            int sayi1 = input.nextInt();
            int sayi2 = input.nextInt();
            int sayi3 = input.nextInt();
            int sayi4 = input.nextInt();
            int sayi5 = input.nextInt();
            int sayi6 = input.nextInt();
            int sayi7 = input.nextInt();
            int sayi8 = input.nextInt();
            int sayi9 = input.nextInt();
            ticket[0] = sayi1;
            ticket[1] = sayi2;
            ticket[2] = sayi3;
            ticket[3] = sayi4;
            ticket[4] = sayi5;
            ticket[5] = sayi6;
            ticket[6] = sayi7;
            ticket[7] = sayi8;
            ticket[8] = sayi9;

        try {
            control(ticket);
        } catch (CustomExeption e) {
            System.out.println(e.getMessage());
            startLoto();
        }

    int[] loto = new int[9];

    Random rnd = new Random();
    boolean tekrarlimi;
    int rnd1;

        for (int i = 0; i < loto.length; i++){
            do{
                tekrarlimi = false;

                rnd1 = rnd.nextInt(49)+1;

                for (int j = 0; j < i; j++) {

                    if(loto[j] == rnd1){

                        tekrarlimi = true;
                        break;
                    }
                }
            }while (tekrarlimi);
            loto[i] = rnd1;
        }
        System.out.println("Biletiniz:");
        System.out.print(Arrays.toString(ticket));
        System.out.println();
        System.out.println("Loto Sonucu:");
        System.out.println(Arrays.toString(loto));

        int sonuc   = karsilastirma(ticket, loto);

        switch (sonuc){
            case 1:
            case 2:
                System.out.println("Maalesef yeterli eslesme yok.bir dahaki sefere...");
                break;
            case 3:
                System.out.println("Tebrikler " +sonuc+ "eslesme var. amorti kazandiniz...");
                break;
            case 4:
            case 5:
                System.out.println("Tebrikler  Buyuk ikramiye kazandiniz...");
                break;
            case 6:
                System.out.println("Tebrikler  Super ikramiye kazandiniz...");
            default:
                System.out.println("Maalesef hic eslesme yok.bir dahaki sefere...");
                break;
        }

    }//startLoto()

    public static int karsilastirma(int[] ticket, int[] loto){

        int sayac = 0;
        for (int i : ticket){
            for (int j : loto){
                if(i==j){
                    sayac++;
                }
            }
        }
        return sayac;
    }
    public static void control(int[] ticket){
        for (int i : ticket) {
            if (i < 0 || i>49){
                throw new CustomExeption("Lutfen gecerli bir sayi giriniz");
            }
        }
    }//control()
}
