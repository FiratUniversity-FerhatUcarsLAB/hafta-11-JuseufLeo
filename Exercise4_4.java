public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
        

Soru: Bir değer döndüren metodu çağırıp sonucunu kullanmazsanız ne olur?

Cevap: Java'da bu hata vermez. Metot çalışır, işini yapar, dönen değer (return value) hafızada bir yere atanmadığı için kaybolur (ignore edilir).

Soru: Bir void metodu bir ifadenin içinde kullanırsanız (örn: println() + 7) ne olur?

Cevap: Java derleme hatası (compile-time error) verir. Çünkü void metotlar bir değer üretmez, dolayısıyla matematiksel veya mantıksal bir işleme sokulamazlar. Hatada genellikle "void type not allowed here" yazar.
    }
}
