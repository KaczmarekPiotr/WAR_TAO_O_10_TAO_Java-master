package a_Zadania.d_Konstruktor;

public class Person {

    private String name = "Piotr";
    private String surname = "Kaczmarek";
    private int age = 31;
    private char gender = 'M';

    //public void setName(String name) {
    //    this.name = name;
    //}

    //public void setSurname(String surname) {
    //    this.surname = surname;
    //}

    //public void setAge(int age) {
    //    this.age = age;
    //}

    //public void setGender(char gender) {
     //   this.gender = gender;
    //}

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Imie : " + this.name + ", Nazwisko : " + this.surname + ", wiek : " + this.age + ", plec : " + this.gender;
    }

}
