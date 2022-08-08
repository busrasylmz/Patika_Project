package day01;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int mat, fizik,kimya,turkce,tarih,muzik;

            System.out.println("Merhaba, Not ortalamasi programina hosgeldiniz !");

            System.out.println("Lutfen Fizik Notunu Giriniz : ");
            fizik =scan.nextInt();

            System.out.println("Lutfen Turkce Notunu Giriniz : ");
            turkce =scan.nextInt();

            System.out.println("Lutfen Tarih Notunu Giriniz : ");
            tarih =scan.nextInt();

            System.out.println("Lutfen Kimya Notunu Giriniz : ");
            kimya =scan.nextInt();

            System.out.println("Lutfen Matematik Notunu Giriniz : ");
            mat =scan.nextInt();

            System.out.println("Lutfen Muzik Notunu Giriniz : ");
            muzik =scan.nextInt();


            int toplam = (mat + fizik + kimya + turkce + tarih + mat + muzik);
            double ort = toplam / 6.0;

            String sonuc = ort >=60 ? "sinifi gecti" : " sinifta kaldi" ;

            System.out.println("Ogrencinin derslerinin ortalamasi : " + ort );

            System.out.println("Ogrenci " + sonuc);


        }

    }

