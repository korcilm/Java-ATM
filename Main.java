public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Muhammet Korçil","292929",2900);
        atm.calis(hesap);
        System.out.println("programdan cıkılıyor...");
    } 
}
