public class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implement the calcTax method for sales tax on unit price
    @Override
    public double calcTax() {
        return price * SALES_TAX;
    }

    // To display product details
    public void displayProduct() {
        System.out.println("Product ID: " + pid);
        System.out.println("Price: Rs" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sales Tax on Unit Price: Rs" + calcTax());
    }
}
