package day04;

import java.util.Scanner;

public class Arac {

    public String type;
    public int prim;

    public int countPrim(int term) {
        if (term ==1){
            switch (type.toLowerCase()){
                case "otomobil" : prim =2000;
                break;
                case "kamyon" : prim = 3000;
                break;
                case "otobus" : prim = countBusPrim(term);
                break;
                case "motosiklet" : prim = 1500;
                default:
                    System.out.println("Hatali giris yaptiniz");
                    prim = 0;
                    break;
            }
        }else if (term ==2){
            switch (type.toLowerCase()){
                case "otomobil" : prim =2500;
                    break;
                case "kamyon" : prim = 3500;
                    break;
                case "otobus" : prim = countBusPrim(term);
                    break;
                case "motosiklet" : prim = 2000;

            }
        }else{
            System.out.println("Hatali giris yaptiniz");
        }
        return prim;
    }

    public int countBusPrim(int term) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen otobus tipini giriniz\n1==> 18-30 koltuklu" +
                "\n2==> 31 ve uzeri koltuklu");
        String busTypeStr = "";

        while (!busTypeStr.equals("1")&& !busTypeStr.equals("2")){
            try {
                busTypeStr = input.nextLine();
                if(!busTypeStr.equals("1")&& !busTypeStr.equals("2")){
                    System.out.println("Hatali giris yaptiniz.\nLutfen gecerli bir otobus tipi giriniz.");
                }
            } catch (Exception e) {
                System.out.println("Hatali giris yaptiniz.\nLutfen gecerli bir otobus tipi giriniz.");
            }


        }
        int busType = Integer.parseInt(busTypeStr); //String datayi integer'a cevirdik
        prim = busType == 1 ? ((term == 1) ? 4000 : 4500) :
                       ((term == 1) ? 5000 : 5500) ;
        return prim;

    }
    public void islemTercih() {
        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("Yeni islem icin ==> 1\nCikmak icin ==> 0 basiniz");
        select = input.nextInt();
        if (select == 1) {
            AracSigortaApplication.start();
        } else {
            System.out.println("Bizi tercih ettiginiz icin tesekkurler..");

        }
    }
}
