package a_Zadania.d_Konstruktor;

import java.net.CacheRequest;

public class CalcApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(12.0, 12.0);
        calc.add(12.0, 24.0);
        calc.printOperations();
    }
}