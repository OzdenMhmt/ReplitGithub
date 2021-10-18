package Calismalarim.ReplitGithub;

import java.util.Locale;
import java.util.stream.Stream;

public class RG42 {

    public static void main(String[] args) {

    /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */
String str="kal";
String str2="dırımlar";
        getKelime(str,str2);
       
    }

    private static void getKelime(String str, String str2) {
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1)+str2);
        }


}
