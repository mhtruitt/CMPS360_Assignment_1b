/**
 * Product
 *
 * Represents one item a retail store sells. Each Product object stores
 * its own name, price, and quantity, and can calculate how much that
 * stock is worth.
 */
public class Product {

    // Attributes are private so other classes can only reach them
    // through the methods below (this is called encapsulation).
    private String name;
    private double price;   // price of ONE unit, in dollars
    private int quantity;   // number of units currently in stock

    // Constructor: runs when we write "new Product(...)" and sets the
    // starting values. "this.name" is the attribute; "name" is the
    // value that was passed in.
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Returns the total value of this product's stock:
    // price per unit multiplied by the number of units.
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Getter methods let other classes read the private attributes.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
