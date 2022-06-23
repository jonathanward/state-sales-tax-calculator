import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    private final Scanner in;
    private final TaxRate taxRate = new TaxRate();

    public Menu(InputStream input) {
        this.in = new Scanner(input);
    }

    public String selectOption(String[] options) {
        String option = null;
        while (option == null) {
            displayOptions(options);
            try {
                option = getUserChoice(options);
            } catch (Exception e) {
                // Error message will be printed with notifyInvalidInput(input)
            }
        }
        return option;
    }

    private String getUserChoice(String[] options) {
        String choice = null;
        String input = in.nextLine();
        try {
            int inputNum = Integer.parseInt(input);
            if (inputNum > 0 && inputNum < options.length + 1) {
                choice = options[inputNum - 1];
            }
        } catch (NumberFormatException e) {
            // Error message will be printed with notifyInvalidInput(input)
        }
        if (choice == null) {
            System.out.println(notifyInvalidInput(input));
            System.out.println();
        }
        return choice;
    }

    public void displayOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println("(" + (i + 1) + ") " + options[i]);
        }
        if (taxRate.getCurrentState() != null) {
            System.out.println("Current state: " + taxRate.getCurrentState());
        }
        System.out.print("Choose an option >>> ");
    }

    public void chooseState() {
        System.out.print("Please enter the two-letter state abbreviation >>> ");
        String input = in.nextLine().toUpperCase();
        String message;
        boolean isInputValid = taxRate.setCurrentState(input);
        if (isInputValid) {
            message = taxRate.toString();
        } else {
            message = notifyInvalidInput(input);
        }
        System.out.println(message);
        System.out.println();
    }

    public void runTaxCalculation() {
        System.out.print("Please enter the price >>> ");
        String input = in.nextLine();
        if (input.charAt(0) == '$') {
            input = input.substring(1);
        }
        String message;
        BigDecimal inputVal;
        try {
            inputVal = new BigDecimal(input);
            BigDecimal tax = TaxCalculator.calculateTax(inputVal, taxRate);
            BigDecimal total = TaxCalculator.calculateTotal(inputVal, tax);
            message = "Tax: $" + tax + "\nTotal: $" + total;
        } catch(Exception e) {
            message = notifyInvalidInput(input);
        }
        System.out.println(message);
        System.out.println();
    }

    private String notifyInvalidInput(String input) {
        return "\"" + input + "\" is invalid.";
    }

    public boolean isStateSet() {
        return taxRate.getCurrentState() != null;
    }

}
