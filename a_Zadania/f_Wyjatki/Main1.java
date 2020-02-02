package a_Zadania.f_Wyjatki;


public class Main1 {

    public static void main(String[] args) {

        int a = factorial(3);
        System.out.println(a);


        try {
            int b = factorial(-9);
            System.out.println(b);
        } catch (IllegalArgumentException e) {
            System.out.println("kupa");;
        }

    }

    static int factorial(int number) {
        if ( number < 0 ) {
        throw new IllegalArgumentException("Podano liczbe mniejsza od 0");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
