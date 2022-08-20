package Projects;

import java.util.Scanner;

public class KuvvetiniAlma {
    public static void main(String[] args) {

        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Siniri giriniz:");
        a = inp.nextInt();
        System.out.println("4'un Katlari:");


        for (int i = 1; i <= a; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in Katlari:");

        for (int i = 1; i <= a; i *= 5) {
            System.out.println(i);
        }
    }
}
