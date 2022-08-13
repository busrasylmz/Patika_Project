package Projects;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String userName, password, change, newPass;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz: ");
        userName = input.nextLine();

        System.out.println("Sifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("busra") && password.equals("patika123")) {
            System.out.print("Giriş Başarıli.");
        } else {
            System.out.println("Girilen şifre hatalı.");
            System.out.println("Yeni Bir Şifre Oluşturmak İster Misiniz?");
            System.out.println("1-Evet\n2-Hayır");
            System.out.print("Seçiniz:");
            change = input.nextLine();
            if (change.equals("1")) {
                System.out.println("Yeni şifreniz eski şifre ve yanlış girilen şifreden oluşamaz!");
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newPass = input.nextLine();
                if (newPass.equals("pass") == newPass.equals("java123")) {
                    System.out.println("Yeni şifre eski şifre ve yanlış girilen şifreden oluşamaz!");
                    return;
                } else {
                    System.out.println("Yeni Şifre Başarıyla Oluşturuldu!");
                }
            } else {
                System.out.print("Şifre değiştirme işlemi iptal edildi.");
            }

        }
    }
}
