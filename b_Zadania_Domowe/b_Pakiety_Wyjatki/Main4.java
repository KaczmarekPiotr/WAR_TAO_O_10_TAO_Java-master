package b_Zadania_Domowe.b_Pakiety_Wyjatki;


import org.w3c.dom.ls.LSOutput;

public class Main4 {

    public static void main(String[] args) {

    toInt("50");

    }

    static int toInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch ( NullPointerException e) {
            return 0;
        }
    }

}
