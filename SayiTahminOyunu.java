package Tekrar;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void tekrarOynaSecimi(){
        System.out.println("Tekrar oynamak ister misiniz? (Evet-Hayır)");
        String cevapBasla = sc.next();
        if (cevapBasla.equalsIgnoreCase("Evet")){
            oyun();
        }else if (cevapBasla.equalsIgnoreCase("Hayır")){
            System.out.println("Oyun bitti. İyi günler.");
        }else{
            System.out.println("Lütfen Evet veya Hayır olarak giriş yapınız.");
            tekrarOynaSecimi();
        }
    }

    public static void oyun(){
        int numara = 0, tahmin = 0;
        numara = rnd.nextInt(50); //Üretilen sayının 0-50 aralığında olduğunu belirtiyoruz. Final değeri değiştirebilirsiniz.
        for (int i = 3; i > 0; i--) { //Kaç hak olacağını belirleyebilirsiniz.
            System.out.println(numara);
            System.out.print((i)+" hakkınız var. ");
            System.out.println("Sayıyı tahmin edin. (1-50)");
            tahmin = sc.nextInt();
            if (tahmin==numara){
                System.out.println("Tebrikler Kazandınız.");
                tekrarOynaSecimi();
                break;
            }else{

            }
        }
        tekrarOynaSecimi();
    }

    public static void ilkGiris(){
        System.out.println(ConsoleColors.PURPLE+"Sayı Tahmin Oyununa Hoşgeldiniz"+ConsoleColors.RESET);
        System.out.println("Oyuna başlamak için yanıt veriniz.(Evet-Hayır)");
        String cevapBasla = sc.next();
        if (cevapBasla.equalsIgnoreCase("Evet")){
            oyun();
        }else if(cevapBasla.equalsIgnoreCase("Hayır")){
            System.out.println("Oyun bitti.");
        }else{
            System.out.println("Lütfen sadece Evet veya Hayır olarak yanıt veriniz.");

        }
    }
    public static void main(String[] args) {
        ilkGiris();
    }
}
