package Projects;

import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        int kg;
        double m,indeks;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Kilonuzu Giriniz : ");
        kg = inp.nextInt();

        System.out.println("Lutfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        m= inp.nextDouble();

        indeks = kg/ (m *m);

        System.out.println("Vucut Kitle Indeksiniz : " + indeks);


    }
}
