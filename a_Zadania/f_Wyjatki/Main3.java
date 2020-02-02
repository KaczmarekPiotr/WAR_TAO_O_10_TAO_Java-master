package a_Zadania.f_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        showLength(null);
    }

    static void showLength(String s) {
        if ( s == null) {
            System.out.println("nie jestes taki madry");
            return;
        } else {
            System.out.println(s.length());
            return;
        }

    }

}
