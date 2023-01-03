package src.main.java.model;

public abstract class Book {

    protected int price;

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public abstract int getPrice();

}
