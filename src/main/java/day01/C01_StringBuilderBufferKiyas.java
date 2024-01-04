package day01;

public class C01_StringBuilderBufferKiyas {

     /*
    2023 Nisan QA Tester interview sorusu
     * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
     * kontrol edip  StringBuilder ,String Buffer ve String class'larinin performanslarini
     * karsilastiralim.
     * Ipucu: long TimeSb = System.nanoTime(); kullanalim
     */

    public static void main(String[] args) {

        String str = "Merhaba";

        long TimeString1 = System.nanoTime();

        for (int i = 0; i <1000; i ++){

            str+= " "; // ==> str = str + " ";
        }

        long TimeString2 = System.nanoTime();

        StringBuffer strbff = new StringBuffer("Merhaba");

        long TimeStrbff1 = System.nanoTime();
        for (int i =0; i < 1000; i ++){
            strbff.append(" ");
        }
        long TimeStrbff2 = System.nanoTime();


        StringBuilder strbld = new StringBuilder("Merhaba");

        long TimeStrbld1 = System.nanoTime();
        for (int i = 0; i <1000; i++) {
            strbld.append(" ");
        }
        long TimeStrbld2 = System.nanoTime();

        long stringTime = TimeString2 - TimeString1;
        long stringBufferTime =TimeStrbff2 - TimeStrbff1;
        long stringBuilderTime =TimeStrbld2 - TimeStrbld1;

        System.out.println("stringTime = " + stringTime/1000 + " nano seconds");
        System.out.println("stringBufferTime = " + stringBufferTime/1000 + " nano seconds");
        System.out.println("stringBuilderTime = " + stringBuilderTime/1000 + " nano seconds");

        System.out.println("********** Uclu Kiyas **********");

        if (stringTime > stringBufferTime && stringTime > stringBuilderTime) {
            System.out.println("En yavas String Classi ");
            if (stringBufferTime > stringBuilderTime) {
                System.out.println("Ikinci yavas Buffer Classidir");
                System.out.println("En hizlisi Builder Classidir");
            } else {
                System.out.println("Ikinci yavas Builder Classidir");
                System.out.println("En hizlisi Buffer Classidir");
            }

        } else if (stringTime > stringBufferTime && stringBufferTime > stringBuilderTime) {
            System.out.println("En yavas Buffer Classidir");
            if (stringTime > stringBuilderTime) {
                System.out.println("Ikinci yavas String Class'idir");
                System.out.println("En hizlisi Builder Class'idir");
            } else {
                System.out.println("Ikinci yavas Builder Class'idir");
                System.out.println("En hizlisi String Class'idir");
            }
        } else {
            System.out.println("En yavas Builder Class'idir");
            if (stringBufferTime > stringTime) {
                System.out.println("ikinci yavas Buffer Classidir");
                System.out.println("En hizlisi String Class'idir");
            } else {
                System.out.println("ikinci yavas String Classidir");
                System.out.println("En hizlisi Buffer Class'idir");
            }
        }
    }


}




