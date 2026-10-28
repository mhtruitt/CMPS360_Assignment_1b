# Retail Inventory Application

A Java console and GUI application for a small retail store. It stores product information, calculates the inventory value of each product, and shows the results in the console and in a `JOptionPane` dialog box.

## Files

| File | Purpose |
|---|---|
| `Product.java` | The `Product` class: private `name`, `price`, and `quantity` attributes, a constructor, getters, and `calculateInventoryValue()` |
| `InventoryApp.java` | Contains `main()`. Creates three `Product` objects, prints their details to the console, and shows a summary dialog |

## Requirements

- Java Development Kit (JDK) 17 or newer ([download](https://adoptium.net))
- A desktop environment, because the dialog box needs a display

Check that your JDK is installed with `java -version` and `javac -version`.

## How to run in VS Code

1. Open this folder with **File > Open Folder**.
2. Open `InventoryApp.java`.
3. Click the **Run** button above `main` (or the play icon at the top right).
4. The console output appears in the Terminal panel, and the dialog opens in its own window.

## How to run from a terminal

Both files must be compiled together because `InventoryApp` uses `Product`:

```bash
javac Product.java InventoryApp.java
java InventoryApp
```

## Expected console output

```
=== Campus Store Inventory ===

Product: Notebook
  Price: $4.75
  Quantity: 120
  Inventory value: $570.00

Product: Backpack
  Price: $39.99
  Quantity: 18
  Inventory value: $719.82

Product: Water Bottle
  Price: $14.50
  Quantity: 45
  Inventory value: $652.50

Total inventory value: $1,942.32
```

## Expected dialog box

A window titled **Inventory Summary** with this text, and an OK button:

```
Inventory value by product:

Notebook: $570.00
Backpack: $719.82
Water Bottle: $652.50

Total: $1,942.32
```

Close the dialog with **OK** and the program ends.

## How the value is calculated

`calculateInventoryValue()` returns `price * quantity`. For the notebooks, that is 4.75 × 120 = 570.00. The total is the sum of all three products.

## Changing the data

Edit the three `new Product(name, price, quantity)` lines at the top of `main()` in `InventoryApp.java`, or add more products to the `products` array.
