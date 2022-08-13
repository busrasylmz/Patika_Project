package Projects;

import java.util.Scanner;

public class HipotenusHesaplama {

    public static void main(String[] args) {

        double kenar1,kenar2,kenar3;

        Scanner sayi = new Scanner(System.in);

        System.out.println("1. Kenar uzunlugu giriniz:");
        kenar1=sayi.nextDouble();

        System.out.println("2. Kenar uzunlugu giriniz: ");
        kenar2=sayi.nextDouble();

        kenar3= Math.sqrt((kenar1 *kenar1)+(kenar2 *kenar2));
        System.out.println("Hipotenus:" + kenar3);


    }

}
