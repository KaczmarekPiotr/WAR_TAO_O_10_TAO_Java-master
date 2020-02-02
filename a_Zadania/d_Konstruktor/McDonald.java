package a_Zadania.d_Konstruktor;

public class McDonald {

    public static void  main(String[] args){

        Burger mcChicken = new Burger("XL", 4.99);
        Burger bigMac = new Burger();

        System.out.println(mcChicken);
        System.out.println(bigMac);



    }
}
