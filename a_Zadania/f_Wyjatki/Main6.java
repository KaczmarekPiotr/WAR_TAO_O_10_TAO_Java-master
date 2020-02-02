package a_Zadania.f_Wyjatki;


import org.w3c.dom.ls.LSOutput;

public class Main6 {

    public static void main(String[] args) {

        System.out.println(divide(4,0));

    }

    static int divide (int a, int b) {
    //   try {
            int c = a / b;
            return c;
    //    } catch (ArithmeticException e) {
    //       System.out.println("Nie dziel przez 0");
    //       return 0;
        }

}
