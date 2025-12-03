public class Multadd {

    public static void main(String[] args) {
        
        // Test 1: Basit multadd testi (1 * 2 + 3 = 5.0)
        System.out.println("Multadd Testi (1, 2, 3): " + multadd(1.0, 2.0, 3.0));

        // Test 2: sin(pi/4) + (cos(pi/4) / 2)
        // a = sin(pi/4), b = 1 (veya direk cos kısmı c olabilir), c = cos(pi/4)/2
        // Formül a*b+c olduğu için:
        // a = 1.0, b = Math.sin(Math.PI / 4), c = (Math.cos(Math.PI / 4) / 2)
        // YA DA: multadd(Math.sin(Math.PI/4), 1.0, Math.cos(Math.PI/4)/2.0);
        
        double sinVal = Math.sin(Math.PI / 4);
        double cosVal = Math.cos(Math.PI / 4) / 2;
        double result1 = multadd(1.0, sinVal, cosVal); 
        System.out.println("Sin/Cos İşlemi Sonucu: " + result1);

        // Test 3: log(10) + log(20)
        // Java'da Math.log() doğal logaritmadır (ln). Soruda "log" genelde 10 tabanı kastedilir.
        // Ancak Math.log10 kullanmak daha güvenlidir.
        // a = 1.0, b = Math.log10(10), c = Math.log10(20)
        double logResult = multadd(1.0, Math.log10(10), Math.log10(20));
        System.out.println("Log İşlemi Sonucu: " + logResult);

        // Test 4: expSum Metodu
        // x = 2.0 için örnek deneyelim
        double x = 2.0;
        System.out.println("expSum(" + x + ") Sonucu: " + expSum(x));
    }

    // Görev: a * b + c işlemini yapar
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // Görev: x * e^(-x) + sqrt(1 - e^(-x))
    // Bunu multadd kullanarak yazmalıyız.
    // Formül: (x) * (e^-x) + (sqrt(1 - e^-x))
    // multadd(a, b, c) -> a=x, b=e^-x, c=sqrt(...)
    public static double expSum(double x) {
        double eNegX = Math.exp(-x); // e üzeri -x
        double sqrtPart = Math.sqrt(1.0 - eNegX);
        
        // multadd çağırarak sonucu döndür
        return multadd(x, eNegX, sqrtPart);
    }
}
