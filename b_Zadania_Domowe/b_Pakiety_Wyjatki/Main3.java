package b_Zadania_Domowe.b_Pakiety_Wyjatki;


public class Main3 {

    public static void main(String[] args) {

    String nullString = null;
        System.out.println(getLength(nullString));
        System.out.println(getLength("super"));

    }

    static int getLength(String str) {
        try {
            return str.length();
        } catch ( NullPointerException e) {
            return 0;
        }
    }

}
