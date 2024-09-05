import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept Employee information
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object and display details with income tax
        Employee employee = new Employee(empId, name, salary);
        employee.displayEmployee();

        // Accept Product information
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object and display details with sales tax
        Product product = new Product(pid, price, quantity);
        product.displayProduct();

        scanner.close();
    }
}
