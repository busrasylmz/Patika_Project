package Projects;

import java.util.Scanner;

public class SinavSonucu {

    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner input= new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat= input.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik= input.nextInt();

        System.out.println("Turkce Notunuz :");
        turkce= input.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya= input.nextInt();

        System.out.println("Muzik Notunuz :");
        muzik= input.nextInt();


        if(mat < 0 || mat > 100)
            mat = 0;
        if(fizik < 0 || fizik > 100)
            fizik = 0;
        if(turkce < 0 || turkce > 100)
            turkce = 0;
        if(kimya < 0 || kimya > 100)
            kimya = 0;
        if(muzik < 0 || muzik > 100)
            muzik = 0;


        double average = (mat + fizik +turkce+kimya+muzik)/ 5 ;

        if(average <= 55){
            System.out.println("Sinif Tekrari, Seneye Gorusmek Uzere!");

        }else{
            System.out.println("Tebrikler Sinifi Gectiniz");
        }


        System.out.println("Ortalamaniz:" + average);
    }
}
