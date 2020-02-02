package b_Zadania_Domowe.b_Pakiety_Wyjatki;


public class Main2 {

    public static void main(String[] args) {

        String[] tab = {"apple", "banana", "cherry"};
        System.out.println(safeGet(tab, 3));


    }

    static String safeGet(String[] strTab, int index) {
        try {
            return strTab[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Brak indexu " + index + " w tablicy.";
        }
    }

}
