package b_Zadania_Domowe.a_Obiekty_klasy;

public class BankAccount {

private int number;
private double cash = 0;

public int getNumber() {
    return number;
}

public double getCash() {
    return cash;
}

public BankAccount(int accountNumber){
    this.number = accountNumber;
}

public void depositCash(double amount) {
    if (amount > 0) {
        this.cash = cash + amount;
    } else {
        System.out.println("Nie mozna zdeponowac kwoty mniejszej niz 0");
    }
    }

public double withdrawCash(double amount) {
    if ( amount > 0 ) {
        if ( amount > cash ) {
        this.cash = 0;
        return cash;
    } else  {
        this.cash = cash - amount;
        return amount;
    }
    } else throw new IllegalArgumentException("Nie mozna wyciagnac kwoty mniejszej od 0");
    }

    public void printInfo() {
        System.out.println("Numer konta : " + this.number + ", stan konta : " + this.cash);
    }

}


