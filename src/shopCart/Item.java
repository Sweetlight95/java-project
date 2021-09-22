package shopCart;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return price * quantity;
    }
    @Override
    public String toString() {
        return name + "\t\t\t" + price + "\t\t" + quantity + "\t\t" + calculateTotal();
    }
}
