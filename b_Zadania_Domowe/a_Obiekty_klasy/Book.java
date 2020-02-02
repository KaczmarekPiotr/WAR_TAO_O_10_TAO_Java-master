package b_Zadania_Domowe.a_Obiekty_klasy;


public class Book {

    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors = new Author[0];

    public Book (int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book ( int id, String title, Author author ) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book ( int id, String title, Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }


}
