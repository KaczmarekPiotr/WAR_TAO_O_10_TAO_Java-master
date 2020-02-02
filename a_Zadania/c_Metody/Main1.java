package a_Zadania.c_Metody;


import javax.xml.namespace.QName;

public class Main1 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Maciek");
        person.setSurname("Kowalski");
        person.setAge(15);
        person.setGender('M');

        person.getFullName();
        person.increaseAge();

        Car car = new Car();
        System.out.println(car);

    }
}
