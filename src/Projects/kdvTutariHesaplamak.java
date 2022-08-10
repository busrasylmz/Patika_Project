package Projects;

import java.util.Scanner;

public class kdvTutariHesaplamak{

    public static void main(String[] args) {

        // KDV ORANI : %18

        double ucret, toplamucret, kdvTutari, kdvOrani = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("ucreti giriniz: ");
        ucret = input.nextDouble();

        kdvTutari = ucret * kdvOrani;
        toplamucret = ucret + kdvTutari;

        System.out.println("kdvsiz ucret= " + ucret );
        System.out.println("kdv ucreti= " + kdvTutari );
        System.out.println("kdvli ucret= " + toplamucret );



    }
}

