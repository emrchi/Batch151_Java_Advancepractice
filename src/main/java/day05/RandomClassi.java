package day05;

import java.util.Random;

public class RandomClassi {

    //Rastgele sayilar ureten class

    public static void main(String[] args) {

        Random rnd = new Random();
        int sayi;
        sayi = rnd.nextInt();
        System.out.println("Sayi : " + sayi); //-2 milyar ile 2milyar arasinda rastgele sayi verir

        int sayi1 = rnd.nextInt(5); //0,1,2,3,4 ==> [0.5) arasindaki degerlerden biri.
        System.out.println("Sayi :" + sayi1);

        //int sayi2 = rnd.nextInt(n)+m;  0+m, 1+m, 2+m, 3+m...(n-1+m
        int sayi2 = rnd.nextInt(5)+2; //2,3,4,5,6 ==> iki kaydirarak..
        System.out.println("Sayi :" + sayi2);

        int sayi3 = 3*rnd.nextInt(5)+2; //3* ==> sayilar arasindaki mesafeyi belirledi.
        System.out.println("Sayi :" + sayi3); //2,5,8,11,14 arasindan,


        int max = 10;
        int min = 5;
        //5 ile 10 arasinda random sayi istiyoruz

        int sayi4 = rnd.nextInt(max); //0,1,2,3,4,5,6,7,8,9 ==> [0,9)
        int sayi5 = rnd.nextInt(max+1); //0,1,2,3,4,5,6,7,8,9,10 ==>[0,10)
        int sayi6 = rnd.nextInt(max+1)+min; //5,6,7,8,9,10,11,12,13,14,15 ==> [0,15)
        int sayi7 = rnd.nextInt(max+1-min)+min; //5,6,7,8,9,10 ==> [0,10)



    }

}
