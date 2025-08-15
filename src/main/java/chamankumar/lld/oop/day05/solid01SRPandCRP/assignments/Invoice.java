//Identify the violations of SRP in this class.

package chamankumar.lld.oop.day05.solid01SRPandCRP.assignments;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Invoice {
    private Book book;
    private Integer quantity;
    private Double discountRate;
    private Double taxRate;

    @Getter(AccessLevel.NONE)
    private double total; // Will not generate a getter

    public Double getTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);
        return price * (1 + taxRate);
        //return 0.0;
    }

    public void printInvoice() {
        System.out.println(quantity + "x " + book.getName() + " " + book.getPrice() + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}




//Solution (Identify the violations of SRP in this class.)
//
//The Invoice class violates the Single Responsibility Principle (SRP) because it handles multiple responsibilities:
//Calculating the total price: This is a business logic responsibility.
//Printing the invoice: This is a presentation responsibility.
//Saving the invoice to a file: This is a persistence responsibility.
//To adhere to SRP, we can refactor the class by separating these responsibilities into different classes. Below is the solution:
//
//Refactored Code
//
//Invoice Class
//The Invoice class will only hold the data related to the invoice.
//
//InvoiceCalculator Class
//This class will handle the business logic for calculating the total price.
//
//InvoicePrinter Class
//This class will handle the responsibility of printing the invoice.
//
//InvoicePersistence Class
//This class will handle the responsibility of saving the invoice to a file.
//
//Explanation
//        Invoice: Holds the data related to the invoice.
//        InvoiceCalculator: Handles the calculation of the total price.
//        InvoicePrinter: Handles the printing of the invoice.
//        InvoicePersistence: Handles saving the invoice to a file.
//This refactoring ensures that each class has a single responsibility, adhering to SRP.