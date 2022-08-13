package Projects;

import java.util.Scanner;

public class ManavToplam {

    public static void main(String[] args) {

        double total;

        double armutTutar= 2.14;
        double elmatutar = 3.67 ;
        double domatesTutar = 1.11;
        double muzTutar= 0.99 ;
        double patlicanTutar = 5 ;

        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kac kilo? :");
        armutKilo= input.nextDouble();

        System.out.println("Elma kac kilo? :");
        elmaKilo =input.nextDouble();

        System.out.println("Domates kac kilo? :");
        domatesKilo=input.nextDouble();

        System.out.println("Muz kac kilo? :");
        muzKilo=input.nextDouble();

        System.out.println("Patlican kac kilo? :");
        patlicanKilo=input.nextDouble();


        // Toplam tutar

        total= armutTutar*armutKilo + elmaKilo *elmatutar + domatesKilo*domatesTutar+ muzKilo*muzTutar + patlicanKilo*patlicanTutar;

        System.out.println("Toplam Tutar : " + total);



    }
}
