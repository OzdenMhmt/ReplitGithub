package Calismalarim.ReplitGithub;

import java.util.Scanner;

public class Replit7_9 {

     public static void main(String[] args) {
        /* 7-----
                 Ugly Number:

         Girilen bir sayının  ugly number olup olmadığını
         kontrol etmek için bir Java programı yazın.

                 Sayı sisteminde,  ugly number  sadece asal faktörleri
         2, 3 veya 5 olan pozitif sayılardır.
                 İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir.
         Kural olarak, 1 dahil.

                 Test Data:
         13

         Beklenen çıktı:
           ugly number  degildir*/


           /*
         int a= scan.nextInt();
         if (a %2==0 || a%3==0 || a%5==0) {
             System.out.println("ugly number 'dir");
         }else{
             System.out.println("ugly number degil");
         }*/


            /* 8----
             Girilen String değerde tersten yazan Java kodunu yazınız.
            ​
             Test Data:
             java
                     avaj*/
         //Scanner scan=new Scanner(System.in);
         /*String str= scan.nextLine();
             StringBuilder ters =new StringBuilder(str);
             System.out.println(ters.reverse());*/


           /*  9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız
                Test Data:
            str1: Java is
             str2: fun

            Beklenen Çıktı:
            java is fun*/

            String str1 ="Java is";
             String str2=" fun";
         System.out.println(str1.concat(str2));

         }
     }

