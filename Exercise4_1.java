public class DatePrinter {

    public static void main(String[] args) {
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        // Amerikan formatı testi
        System.out.println("Amerikan Formatı:");
        printAmerican(day, date, month, year);

        // Avrupa formatı testi
        System.out.println("Avrupa Formatı:");
        printEuropean(day, date, month, year);
    }

    // Amerikan: "Monday, July 22, 2019"
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa: "22 July 2019, Monday"
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }
}
