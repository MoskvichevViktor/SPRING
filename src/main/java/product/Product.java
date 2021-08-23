package product;

public class Product {
    int id;
    String title;
    int cost;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + "." + " " + title + " " + cost;
    }
}
