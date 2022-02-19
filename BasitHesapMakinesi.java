package Tekrar;

import java.util.Scanner;

public class BasitHesapMakinesi {
    static Scanner sc = new Scanner(System.in);

    public static double toplamaHesaplama(double sayiBir, double sayiIki) {
        return sayiBir + sayiIki;
    }

    public static double cikarmaHesaplama(double sayiBir, double sayiIki) {
        return sayiBir - sayiIki;
    }

    public static double bolmeHesaplama(double sayiBir, double sayiIki) {
        return sayiBir / sayiIki;
    }

    public static double carpmaHesaplama(double sayiBir, double sayiIki) {
        return sayiBir * sayiIki;
    }

    public static double yuzdeHesaplama(double sayi, double yuzde) {
        return sayi * (yuzde/100);
    }

    public static void islem() {
        System.out.println("Basit Hesap Makinesi");
        System.out.println("Yapmak istediğiniz işlemi seçiniz.(1-6)\n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma\n5-Yüzde");
        int secimIlk = sc.nextInt();
        switch (secimIlk) {
            case 1:
                System.out.println("Birinci sayıyı giriniz:");
                double sayiBir = sc.nextInt();
                System.out.println("İkinci sayıyı giriniz:");
                double sayiIki = sc.nextInt();
                System.out.println("İşlem sonucu: "+toplamaHesaplama(sayiBir,sayiIki));
                break;
            case 2:
                System.out.println("Birinci sayıyı giriniz:");
                sayiBir = sc.nextInt();
                System.out.println("İkinci sayıyı giriniz:");
                sayiIki = sc.nextInt();
                System.out.println("İşlem sonucu: "+cikarmaHesaplama(sayiBir,sayiIki));
                break;
            case 3:
                System.out.println("Bölünen sayıyı giriniz:");
                sayiBir = sc.nextInt();
                System.out.println("Bölen sayıyı giriniz:");
                sayiIki = sc.nextInt();
                System.out.println("İşlem sonucu: "+bolmeHesaplama(sayiBir,sayiIki));
                break;
            case 4:
                System.out.println("Birinci sayıyı giriniz:");
                sayiBir = sc.nextInt();
                System.out.println("İkinci sayıyı giriniz:");
                sayiIki = sc.nextInt();
                System.out.println("İşlem sonucu: "+carpmaHesaplama(sayiBir,sayiIki));
                break;
            case 5:
                System.out.println("Yüzdesini almak istediğiniz sayıyı giriniz:");
                double sayi = sc.nextDouble();
                System.out.println("Yüzdeyi giriniz");
                double yuzde = sc.nextDouble();
                System.out.println("İşlem sonucu: "+yuzdeHesaplama(sayi,yuzde));
                break;
            default:
                System.out.println("Geçersiz bir işlem seçtiniz.");
                break;
        }
        tekrarIslem();
    }

    public static void tekrarIslem(){
        System.out.println("Tekrar bir işlem yapmak istiyor musunuz? (1-2)\n1-Evet\n2-Hayır");
        int secimIki = sc.nextInt();
        switch (secimIki){
            case 1:
                islem();
                break;
            case 2:
                System.out.println("Program sonlandırıldı.");
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
                tekrarIslem();
                break;
        }
    }

    public static void main(String[] args) {
        islem();
    }
}
