package a_Zadania.c_Metody;

public class Person {

    private String name = "Piotr";
    private String surname = "Kaczmarek";
    private int age = 31;
    private char gender = 'M';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String Surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void getFullName() {
        String imieNazwisko = this.name + " " + this.surname;
        System.out.println(imieNazwisko);
    }

    public void increaseAge() {
        int increaseAge = ++age;
        System.out.println(increaseAge);
    }

}
