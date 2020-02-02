package a_Zadania.d_Konstruktor;

public class Main1 {

    public static void main(String[] args) {

        Person jozek = new Person("Jozek", 34);
        Person anna = new Person("anna", "Kowalska", 41, 'F');
        Person maciek = new Person("Maciek", "Martyniuk");

        System.out.println(jozek);
        System.out.println(anna);
        System.out.println(maciek);

        Burger mcKing = new Burger("XL", 9.99);

        System.out.println(mcKing);

    }
}
