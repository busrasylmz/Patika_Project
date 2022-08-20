import java.util.Scanner;

public class Hesaplama {

    public static void main(String[] args) {

        int   toplam=0,sayiAdedi=0 ,j , girilenSayi;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sayinizi giriniz.");
        girilenSayi=input.nextInt();


        for (j=1 ; j<=girilenSayi ; j++){
            if (j%3==0 && j%4==0){
                toplam+=j;
                sayiAdedi++;
            }
        }
        System.out.println("ortalamaniz =" + (toplam/sayiAdedi));

    }
}



