package day01;

import java.util.LinkedList;

public class Odev2 {

    public static void main(String[] args) {

        int sayi1=456;
        int sayi2=219;
        LinkedList<Integer> sayi1List=new LinkedList<>();
        LinkedList<Integer >sayi2List =new LinkedList<>();
        do {
            sayi1List.add(sayi1);
            sayi1/=2;
            sayi2List.add(sayi2);
            sayi2*=2;
        }while (sayi1>0);
        System.out.println(sayi1List);
        System.out.println(sayi2List);

        int sum=0;
        for (int i=0;i<sayi1List.size();i++) {
            if (sayi1List.get(i) % 2 != 0) {
                sum+=sayi2List.get(i);
            }
        }
        System.out.println(sum);
    }


}
