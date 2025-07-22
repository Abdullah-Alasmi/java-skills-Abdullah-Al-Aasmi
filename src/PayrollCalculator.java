public class PayrollCalculator {
    // Method to calculate weekly pay based on employee type and hours
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
// Employee types: "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN"
// Use switch case for different rules:
// FULL_TIME: Regular pay for 40 hours, overtime (1.5x) for hours > 40
// PART_TIME: Regular pay, no overtime, max 25 hours
// CONTRACTOR: Flat rate, no overtime rules
// INTERN: 20% discount from hourly rate, max 20 hours
// Handle invalid employee types and negative values
    }
    // Method to calculate tax deduction based on pay brackets
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
// Tax brackets using nested if-else:
// $0-500: 10% tax
// $501-1000: 15% tax
// $1001-2000: 20% tax
// Above $2000: 25% tax
// If hasHealthInsurance is true, reduce tax by $50
// Return total tax amount
    }
    // Method to process multiple employees and find statistics
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) {
// Calculate pay for each employee
// Find: highest paid employee, lowest paid employee, average pay
// Count how many employees worked overtime (>40 hours)
// Display results in a formatted table
// Handle arrays of different lengths gracefully
    }
    public static void main(String[] args) {
// Test data:
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
// Test individual calculations first
// Then process the entire payroll
// Show all results clearly

    }
}
