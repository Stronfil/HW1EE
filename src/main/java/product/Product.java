package product;

public class Product {
    private int id;
    private String title;
    private String cost;

    public Product(int id, String title, String cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, title, cost);
    }
}
