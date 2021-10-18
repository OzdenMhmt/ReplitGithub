package Calismalarim.ReplitGithub;

import java.util.Arrays;

public class RG41 {

    public static void main(String[] args) {

    /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */
String str="Bu bir başlıktır";
String arr[]=str.split(" ");
        for (int i = 0; i < arr.length ; i++) {
           String kontrol= arr[i];
           arr[i]=kontrol.substring(0,1).toUpperCase()+kontrol.substring(1,kontrol.length());
           System.out.print(arr[i]+" ");
        }
        //2.yol
        Arrays.stream(arr).map(t->t.substring(0,1).toUpperCase()+t.substring(1)).forEach(t-> System.out.print(t+ " "));
    }
}
