public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implement the calcTax method for income tax
    @Override
    public double calcTax() {
        return salary * INCOME_TAX;
    }

    // To display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs" + salary);
        System.out.println("Income Tax: Rs" + calcTax());
    }
}
