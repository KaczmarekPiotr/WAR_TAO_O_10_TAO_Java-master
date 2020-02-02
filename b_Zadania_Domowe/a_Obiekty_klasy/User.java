package b_Zadania_Domowe.a_Obiekty_klasy;


public class User {

    private int id;
    private String firstName;
    private String lastName;
    private Book[] books = new Book[0];

    public User ( int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBook(Book book) {

    }
}
