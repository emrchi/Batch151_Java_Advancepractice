package day02;

public class C01_EnUzunPalindrome {

    public static void main(String[] args) {

        //String str = "hellosannasmith";
        //Verilen str datadaki en uzun palindrome'u veren kodu yaziniz.
        //Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.

       // nalan ==> nalan


        String str = "emm";
        enUzunPalidrome(str);
        System.out.println(enUzunPalidrome(str));

                



    }

    public static String enUzunPalidrome(String str) {
        
        String longestPalindrome = "";

        for (int i = 0; i < str.length() ; i++) {
            for (int j = i+1; j <= str.length(); j++) { //"hellosannasmith"
               String currentString = str.substring(i,j);
                System.out.println("currentString = " + currentString);
                if(isPalindrome(currentString) && currentString.length() >longestPalindrome.length()) {
                    
                    longestPalindrome = currentString;
                    
                }

            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str) { //"hellosannasmith"

        int leftIndex = 0;
        int rightIndex = str.length()-1;

        while(leftIndex < rightIndex){
            if(str.charAt(leftIndex) != str.charAt(rightIndex)){
                return false;
            }else {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;


    }
}
