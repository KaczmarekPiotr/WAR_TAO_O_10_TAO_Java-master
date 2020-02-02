package a_Zadania.d_Konstruktor;

public class Burger {

    private String size;
    private double price;

    public Burger(String size, double price) {
        this.price = price;
        this.size = size;

    }

    public Burger() {
        this.price = 10.00;
        this.size = "L";

    }

    public String toString() {
        return "cena : " + this.price + ", rozmiar : " + this.size;

    }

}
