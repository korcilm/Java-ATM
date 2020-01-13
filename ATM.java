import java.util.Scanner;
public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("KorçilBank'a Hoşgeldiniz");
        System.out.println("*********************************");
        System.out.println("Kullanıcı Girişi ");
        System.out.println("*********************************");
        
        int giris_hakki = 3;
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı..");
                break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("kalan giriş hakkı : "+ giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Giriş hakkınız kalmadı..");
                return;
            }            
        }
        System.out.println("****************************");
        String islemler = "1.Bakiye Görüntüle\n"+
                          "2.Para Yatırma\n"+
                          "3.Para Çekme\n"+
                          "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**************************");
        while(true){
            System.out.println("Bir işlem seçiniz : ");
            String islem = scan.nextLine();
            
            if(islem.equals("q") ){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : "+ hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriiniz : ");
                int tutar = scan.nextInt();
                scan.nextLine();
                
                hesap.paraYatirma(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCekme(tutar);
            }
            else {
                System.out.println("Gecersiz işlem....");
            }           
        }
    }
}
