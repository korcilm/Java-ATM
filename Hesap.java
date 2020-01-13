public class Hesap {
    private String kullanici_adi;
    private String parola;
    private double bakiye;
    
    public Hesap(String kullanici_adi, String parola, double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    public String getKullanici_adi(){
        return kullanici_adi;
    }
    public String getParola(){
        return parola;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }
    public void setParola(String parola){
        this.parola = parola;
    }
    public void setBakiye(int bakiye){
        this.bakiye = bakiye;
    }
    public void paraYatirma(int miktar){
        bakiye += miktar;
        System.out.println("Bakiyeniz : "+ bakiye);
    }
    public void paraCekme(int miktar){
        if((bakiye - miktar) < 0){
            System.out.println("yeterli bakiyeniz yoktur..");
        }
        else{
            bakiye -= miktar;
            System.out.println("Yeni bakiyeniz : "+ bakiye);
        }
    }
}
