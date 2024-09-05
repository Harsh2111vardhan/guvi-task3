public interface Taxable {
    // Constants
    double SALES_TAX = 0.07;     // 7%
    double INCOME_TAX = 0.105;   // 10.5%

    // Abstract method
    double calcTax();
}
