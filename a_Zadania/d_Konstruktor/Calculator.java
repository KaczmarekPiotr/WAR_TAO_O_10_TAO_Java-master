package a_Zadania.d_Konstruktor;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.copyOfRange;

public class Calculator {
    private String[] operationsHistory;

    public Calculator() {
        this.operationsHistory = new String[0];
           }

     public double add(double num1, double num2) {
        double result = num1 + num2;
        addHistory("added" + num1 + " to " + num2 + " got " +  result);
        return result;
     }

    private void addHistory(String history) {
        this.operationsHistory = copyOf(operationsHistory, operationsHistory.length + 1);
        operationsHistory[operationsHistory.length-1] = history;
    }

    public void printOperations() {
        for (String s : operationsHistory) {
            System.out.println(s);
        }


     }
}
