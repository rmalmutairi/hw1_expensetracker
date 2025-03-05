import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

  public static void main(String[] args) {
    
    // Create MVC components
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Serial");
    tableModel.addColumn("Amount");
    tableModel.addColumn("Category");
    tableModel.addColumn("Date");
    

    
    ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

    // Initialize view
    view.setVisible(true);

    // Handle add transaction button clicks
    view.getAddTransactionBtn().addActionListener(e -> {
      try {

        // Get raw input values from the view
        String amountInput = view.getAmountInputText();
        String categoryInput = view.getCategoryInputText();

        // Validate the inputs
        double amount = InputValidation.validateAmount(amountInput);
        String category = InputValidation.validateCategory(categoryInput);

     
        // Create transaction object
        Transaction t = new Transaction(amount, category);

     
        // Call controller to add transaction
        view.addTransaction(t);
    
      } catch (IllegalArgumentException ex) {
     
        // Display error message on the GUI
     
        JOptionPane.showMessageDialog(view, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
 
      }

    });


  }

}