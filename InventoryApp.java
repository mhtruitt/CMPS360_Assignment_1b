import javax.swing.JOptionPane;

/**
 * InventoryApp
 *
 * Creates several Product objects, prints each product's details and
 * inventory value to the console, and shows a summary in a dialog box.
 */
public class InventoryApp {

    public static void main(String[] args) {

        // --- Create the products (objects built from the Product class) ---
        Product product1 = new Product("Notebook", 4.75, 120);
        Product product2 = new Product("Backpack", 39.99, 18);
        Product product3 = new Product("Water Bottle", 14.50, 45);

        // Keep the products in an array so we can loop over them
        // instead of repeating the same code for each one.
        Product[] products = {product1, product2, product3};

        double total = 0;                          // running total of all inventory
        StringBuilder summary = new StringBuilder(); // text for the dialog box
        summary.append("Inventory value by product:\n\n");

        System.out.println("=== Campus Store Inventory ===");
        System.out.println();

        // --- Console output: one block per product ---
        for (Product product : products) {
            double value = product.calculateInventoryValue();
            total += value;

            System.out.println("Product: " + product.getName());
            System.out.println("  Price: $" + String.format("%,.2f", product.getPrice()));
            System.out.println("  Quantity: " + product.getQuantity());
            System.out.println("  Inventory value: $" + String.format("%,.2f", value));
            System.out.println();

            // Add this product's name and value to the dialog text.
            summary.append(product.getName())
                   .append(": $")
                   .append(String.format("%,.2f", value))
                   .append("\n");
        }

        System.out.println("Total inventory value: $" + String.format("%,.2f", total));

        // --- Dialog box: graphical summary ---
        summary.append("\nTotal: $").append(String.format("%,.2f", total));

        JOptionPane.showMessageDialog(
            null,                       // no parent window
            summary.toString(),         // message to display
            "Inventory Summary",        // window title
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
