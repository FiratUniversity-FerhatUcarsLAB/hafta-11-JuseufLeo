/*
 * Ad Soyad: Yusuf Aslan
 * Ogrenci No: 250541068
 * Tarih: 03.12.2025
 */




public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13); // 1- zippo ilk kez çağrılır
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 5- blimp ekrana basılır
        zippo("ping", -5); // 6- zippo ikinci kez çağrılır
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 2 ve 7- ikinci zippo çağrısında bu blok çalışır
            System.out.println(quince + " zoop ");  // 8- flag 0'dan küçükse quince + zoop yazdırılır
        } else {
            System.out.println("ik"); // 3- ilk zippo’da çalışır (ve ik yazdırılır)
            baffle(quince); // 4- baffle çağrılır
            System.out.println("boo-wa-ha-ha"); // 9- baffle’dan dönünce çalışır (boo-wa-ha-ha yazdırılır)
        }
    }
}
