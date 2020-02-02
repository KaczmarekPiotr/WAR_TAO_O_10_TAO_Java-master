package b_Zadania_Domowe.b_Pakiety_Wyjatki;


public class Main1 {

    public static void main(String[] args) {

        average("4", "0");

    }

    static void average( String a, String b) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            System.out.println(x / y);
        } catch ( NumberFormatException e ) {
            System.out.println("Nie rozpoznany format liczb");
        } catch ( ArithmeticException e) {
            System.out.println("Nie dziel cholero przez 0");
        } finally {
            System.out.println("I TAK SIE WYKONALO");
        }

    }
}
