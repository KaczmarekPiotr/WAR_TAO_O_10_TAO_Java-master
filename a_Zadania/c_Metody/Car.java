package a_Zadania.c_Metody;

public class Car {

    private String brand = "Opel";
    private String model = "Zafira";
    private int price = 120000;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Marka : " + brand + ", cena : " + price;
    }
}
