import java.util.Scanner;

public class kullanici {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız: ");
        userName =input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("ismail") && password.equals("1234")){
            System.out.println("Başarılı Giriş Yaptınız.");
        }
        else if (userName.equals("ismail") && !password.equals("1234")){
            System.out.println("Şifreniz Yanlış sıfırlamak için q' ya basınız basınız");
            String sifreYenileme = input.nextLine();

            if (sifreYenileme.equals("q")){
                System.out.println("Yeni bir şifre giriniz");
                String newPass = input.nextLine();

                while(newPass.equals("1234")){
                    System.out.println("Yeni şifre eski ile aynı olamaz");
                    newPass = input.nextLine();
                }
                input.close();
                System.out.println("Yeni şifreniz oluşturuldu");
            }
            else {
                System.out.println("İşleminiz sonlandırıldı.");
            }

        }
    }
}
