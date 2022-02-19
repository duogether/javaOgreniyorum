package Tekrar;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void ilkGiris(){
        System.out.println("Oyuna başlamak için yanıt veriniz.(Evet-Hayır)");
        String cevapBasla = sc.next();
        if (cevapBasla.equalsIgnoreCase("Evet")){
            oyun();
        }else if(cevapBasla.equalsIgnoreCase("Hayır")){
            System.out.println("Oyun bitti.");
        }else{
            System.out.println("Lütfen sadece Evet veya Hayır olarak yanıt veriniz.");
            ilkGiris();
        }
    }
    public static void tekrarOynamaKodu(){
        System.out.println("Tekrar başlamak için yanıt veriniz.(Evet-Hayır)");
        String cevapBasla = sc.next();
        if (cevapBasla.equalsIgnoreCase("Evet")){
            oyun();
        }else if(cevapBasla.equalsIgnoreCase("Hayır")){
            System.out.println("Oyun bitti.");
        }else{
            System.out.println("Lütfen sadece Evet veya Hayır olarak yanıt veriniz.");
        }
    }

    public static void sonuc(){

    }
                                                //0 taş - 1 kağıt - 2 makas
    public static void kullaniciSecimKodu(){
        int bilgisayarSecim = rnd.nextInt(3); // 0 Taş 1 Kağıt 2 Makas
        String kullaniciSecim = sc.next();
        if (kullaniciSecim.equalsIgnoreCase("Taş")){
            if (bilgisayarSecim==0){
                System.out.println("Berabere Kaldınız");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+" Taş");
                tekrarOynamaKodu();
            }else if(bilgisayarSecim==2){
                System.out.println("Kazandınız.");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+" Makas");
                tekrarOynamaKodu();
            }else {
                System.out.println("Kaybettiniz.");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+" Kağıt");
                tekrarOynamaKodu();
            }
        }else if (kullaniciSecim.equalsIgnoreCase("Kağıt")){
            if (bilgisayarSecim==1){
                System.out.println("Berabere Kaldınız");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+" Kağıt");
                tekrarOynamaKodu();
            }else if(bilgisayarSecim==2){
                System.out.println("Kazandınız.");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+ " Taş");
                tekrarOynamaKodu();
            }else {
                System.out.println("Kaybettiniz.");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+" Makas");
                tekrarOynamaKodu();
            }
        }else if (kullaniciSecim.equalsIgnoreCase("Makas")){
            if (bilgisayarSecim==2){
                System.out.println("Berabere Kaldınız");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+" Makas");
                tekrarOynamaKodu();
            }else if(bilgisayarSecim==1){
                System.out.println("Kazandınız.");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+ "Kağıt");
                tekrarOynamaKodu();
            }else {
                System.out.println("Kaybettiniz.");
                System.out.println("Yaptığınız seçim: "+kullaniciSecim+"\t"+"Bilgisayarın seçimi:"+ " Taş");
                tekrarOynamaKodu();
            }
        }else{
            System.out.println("Lütfen sadece Taş,Kağıt,Makas seçeneklerinden birini giriniz.");
            oyun();
        }
    }

    public static void oyun(){
        System.out.println("Seçim Yapınız(Taş,Kağıt,Makas)");
        kullaniciSecimKodu();
    }

    public static void main(String[] args) {
        System.out.println(ConsoleColors.YELLOW+"Taş, Kağıt & Makas Oyununa Hoşgeldiniz"+ConsoleColors.RESET);
       ilkGiris();
    }
}
