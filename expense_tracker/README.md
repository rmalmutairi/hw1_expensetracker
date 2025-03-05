# hw1- Manual Review

The homework will be based on this project named "Expense Tracker",where users will be able to add/remove daily transaction. 

## How to build and test (from Terminal):
1. Make sure that you have Apache Ant installed. Run ```ant``` in the root directory, which contains the build.xml build file.

2. Run ```ant document``` to generate the jdoc folder. In that folder, open the index.html file.

3. Run ```ant compile``` to generate the class files. Compiled classes will be in the bin directory.

4. Run ```ant test``` to compile all unit tests and run them.

## How to run (from Terminal):
After building the project (i.e., running ant), run: ```java -cp bin ExpenseTrackerApp```

## How to clean up (from Terminal):
Run ```ant clean``` to clean the project (i.e., delete all generated files).

## Code Modification

Create a file named ```InputValidation.java```  to validate the ```amount``` and ```category``` field of this app. Some hints are as follows:
1. The ```amount``` should be greater than 0 and less than 1000. 
2. It should be a valid number. 
3. The ```category``` should be a valid string input from the following list: "food", "travel", "bills", "entertainment", "other" .
4. You should display error messages on the GUI and not accept the invalid input. . You should throw an appropriate exception. 
5. Update the ExpenseTrackerApp.java with the input validation steps for adding transaction.

## Manual Review
Here are some examples of satisfying ```non-functional`` requirements:
1. Understandability
• External documentation (such as a README file) improves program understanding. This app’s
README file helps users and developers by providing the build instructions.


Here are some examples of violating ```non-functional``` requirements:
1.  Modularity
• The app does not apply the MVC architecture pattern.
• The app should declare the following packages and their classes: model, view, controller. 

## Understandibility
For the understandability section, we will be inspecting your git log. You should include either the .git folder or else a gitLog.(pdf | txt).

## Part 3: Understandability - Documentation 
## Update the README file to briefly describe the supported features. 
The Expanse Tracker Application allows users to manage daily transactions. With the following orimary features;
1. Adding transactions - User input the amount and category and the app will validate the inpute before adding it to the list of added and validated transcations. 
2. Viewing Transactions - Where all the transactions are displayed in a table format along with their details such as date, total, serial. 
3. Input validation: This app also includes validation to ensure that the amounts that being added are greater than 0 and less than 1000, as well as the category is one of the allowed values (food, travel, bills, entertainment, other)
4. Extensiblity for Filttering: Although not implemtned yet, the design anticipates future addition like filltering by category, amound range, and date.  
