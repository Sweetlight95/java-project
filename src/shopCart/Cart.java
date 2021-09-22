package shopCart;

import java.util.ArrayList;

public class Cart {
    private String ownerName;
    public ArrayList<Item> items = new ArrayList<>();
    public Cart(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addItems(Item item){
        items.add(item);
    }
    @Override
    public String toString(){
        String stringToReturn = "";
        for (Item item: items){
            stringToReturn+=item.toString()+"\n";
        } return stringToReturn;
}
    public double calculateTotalPrice() {
        double total = 0;
        for (Item item: items) {
            total = item.calculateTotal();
        }
        return total;
    }
    public double calculateVatOff(double percentage) {
        return calculateTotalPrice() * (percentage / 100.0);
    }
}
