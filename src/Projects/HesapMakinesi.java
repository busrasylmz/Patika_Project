package Projects;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {


        int number1,number2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("Number1 Giriniz: ");
        number1 = input.nextInt();

        System.out.print("Number2 Giriniz: ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.print("Toplama Sonucu: " + (number1 + number2));
                break;

            case 2:
                System.out.print("Cikarma Sonucu: " + (number1 - number2));
                break;

            case 3:
                System.out.print("Carpma Sonucu: " + (number1 * number2));
                break;

            case 4:

                if(number2 != 0){
                    System.out.print("Bolme Sonucu: " + (number1 / number2));
                }else{
                    System.out.println("Sifira Bolunemez");
                }
                break;

            default:
                System.out.println("Hatali Kodlama");

        }


    }

}
