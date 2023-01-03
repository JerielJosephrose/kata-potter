package src.main.java.model;

public class PotterBook extends Book{

    public PotterBook(String title) {
        super(title);
    }

    @Override
    public int getPrice() {
        return 8;
    }
}
