package day01;

import java.util.Arrays;

public class C02_CamelCase {

    public static void main(String[] args) {


        // INTERWIEW QUESTIONS QA AUTOMATION Nisan 2023

    /*
    String str = "cats AND*Dogs-are Awesome"
    verilen String Datanin her bir kelimenin ilk harfini
    buyuk harf diger harfleri kucuk harf olacak
    "CatsAndDogsAreAwesome" sekilde veren kodu yaziniz
    input==> "cats AND*Dogs-are Awesome"
    output ==>"CatsAndDogsAreAwesome
    */




        String str = "cats AND*Dogs-are Awesome";

        String [] word = str.split("[^a-zA-Z]");
        System.out.println(Arrays.toString(word));
        StringBuilder sb = new StringBuilder();
        for (String w : word) {
            sb.append(w.substring(0,1).toUpperCase());
            sb.append(w.substring(1).toLowerCase());
        }

        System.out.println(sb);





    }
}
