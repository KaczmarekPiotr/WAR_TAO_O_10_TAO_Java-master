package a_Zadania.f_Wyjatki;


public class Main5 {

    public static void main(String[] args) {

    stringChange("123");
    stringChange("abc");
    stringChange("543");

    }

    static void stringChange (String abc) {
    try {
        int x = Integer.parseInt(abc);
        System.out.println(x);
    } catch ( NumberFormatException e) {
        System.out.println("Bledny format liczb!!!");
    } finally {
        System.out.println("Ale ta Java smieszna ha ha ha ");
    }
    }



}
