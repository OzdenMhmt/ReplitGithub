package Calismalarim.ReplitGithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Replit25_27 {

    public static void main(String[] args) {
       /*13----
       Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

       Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

       Test Data:
       madam

       Beklenen Çıktı:
       True*/

      /* String str="racecars";
       StringBuilder sb=new StringBuilder(str);
       if (sb.reverse().toString().equalsIgnoreCase(str)) {
           System.out.print("this is palindrome");
       }else System.out.print("this is not palindrome");

       System.out.println("");*/

      /* 14----
       Girilen iki String veriyi karşılaştıran Java kodu yazınız.

       Test data:
       1. String : techproed.com
       2. String : Techproed.com

       Beklenen Çıktı:
       False*/
       /*String str2="techproed.com";
       String str3="Techproed.com";
       System.out.println(str2.contains(str3));*/

      /* 15----
       Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

       Test Data:
       Java is fun

       Beklenen Çıktı
       0. pozisyondaki karakter : J

       5. pozisyondaki karakter : i*/

       /*String str4=" Java is fun";
       String ch1="J";*/
        //System.out.println(str4.trim().indexOf(ch1)+" .pozisyondaki karakter : "+ch1);
        //

       /*17--- /*
               Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

       Test data:

       Beklenen Çıktı:
       12   */
      /* int sayi1=1;
       int sayi2=05;
       int sayi3=10;
       System.out.println(sayi1<sayi2? (sayi1<sayi3? sayi1: sayi3 ):(sayi2<sayi3? sayi2: sayi3));
      */
       /*
       25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]
            ​
    Aranan değer:56
            ​
    Beklenen Çıktı:
            56 sayısı arrayin 4. elemanı
​
        */

      /* int arr[]={12,15,43,23,56,76,78,90,77,43};
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] ==78) {
               System.out.println("Array'in 56 iceren elemani :"+i+".indexi");
           }
       }*/
       /*
         26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
            ​
    Beklenen Çıktı:
            [Python, JAVA, PHP, Perl, C#, C++]
            ​*/

      /* String arr2[]={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
       List<String>list=new ArrayList<>(Arrays.asList(arr2));
       System.out.println("Beklenen Cikti: \n"+list); */



          /*  27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
​
    Array: [1232,2345,5467,678,3454,2312,3451]
            ​*/
        int arr3[] = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr3);
        System.out.println(arr3[arr3.length - 1]);

        int max1 = IntStream.of(arr3).max().getAsInt();
        System.out.println(max1);

      /* 28----
       Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
​
       Array: [1,2,3,4,5,6,7,8,9]
​
       Beklenen Çıktı:
​
       Tek Sayilar: 5
       Cift Sayilar: 4*/

        int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ciftCo = 0;
        int tekCo = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 2 == 0) {
                ciftCo++;

            } else if (arr4[i] % 2 != 0) {
                tekCo++;
            }

        }
        System.out.println("Ciftsayi sayisi : " + ciftCo + " Teksayi sayisi : " + tekCo);

       /*29----
       Bir String değişkeni cümlesi verildiğinde,
               her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
​
       Test Data:
       sentence -> "Java is fun"
       reversed -> "fun is Java"
​
    *************************************************************************/

        String str3 = "Java is fun";
        String arr5[] = str3.split(" ");
        String str4 = "";
        for (int i = arr5.length - 1; i >= 0; i--) {
            str4 += arr5[i] + " ";
        }
        System.out.println(str4);
      /* 30---
               Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
​
       Test Data:
       birinci binary number: 100010
       ikinci  binary number: 110010
​
       Beklenen Çıktı:
       1010100*/

        int birincibinarynumber=100010;
        int ikincibinarynumber=110010;
    }
}

