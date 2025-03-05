public class InputValidation {

    /**
     * Validates that the input amount is a valid number greater than 0 and less than 1000.
     * @param input The input string to validate.
     * @return The parsed double value if valid.
     * @throws IllegalArgumentException if the input is invalid.
     */
    public static double validateAmount(String input) throws IllegalArgumentException {
        System.out.println("DEBUG: validateAmount called with input = " + input); // Debug line
        double amount;
        try {
            amount = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Amount must be a valid number.");
        }
        if (amount <= 0 || amount >= 1000) {
            throw new IllegalArgumentException("Amount must be greater than 0 and less than 1000.");
        }
        return amount;
    }

    /**
     * Validates that the category is one of the allowed values.
     * @param input The category input string.
     * @return The trimmed and lowercased category if valid.
     * @throws IllegalArgumentException if the category is invalid.
     */
    public static String validateCategory(String input) throws IllegalArgumentException {
        String category = input.trim().toLowerCase();
        if (!(category.equals("food") || category.equals("travel") || category.equals("bills")
            || category.equals("entertainment") || category.equals("other"))) {
            throw new IllegalArgumentException("Category must be one of: food, travel, bills, entertainment, or other.");
        }
        return category;
    }
}
