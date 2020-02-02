package b_Zadania_Domowe.a_Obiekty_klasy;

public class Main1 {

    public static void main(String[] args) {

    BankAccount mojeKonto = new BankAccount(1551);

    mojeKonto.printInfo();

    mojeKonto.depositCash(50.50);

    mojeKonto.printInfo();

    mojeKonto.withdrawCash(100.00);

    mojeKonto.printInfo();

    mojeKonto.depositCash(-20.20);

    mojeKonto.printInfo();

    }

}
