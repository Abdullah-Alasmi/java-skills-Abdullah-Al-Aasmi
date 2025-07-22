public class PayrollCalculator {
    // Method to calculate weekly pay based on employee type and hours
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
// Employee types: "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN"
        double weekPay = 0;
        switch (employeeType){
            case "FULL_TIME":
                if(hoursWorked > 40){
                    double overHourlyRate = hourlyRate - 40;
                    weekPay =  (1.5 * overHourlyRate) + hourlyRate * hoursWorked;
                }else{
                    weekPay = hourlyRate * hoursWorked;
                }
            case "PART_TIME":
                if(hoursWorked<=25){
                    weekPay = hourlyRate * hoursWorked;
                }else{
                    weekPay = hourlyRate * 25;
                }

            case "CONTRACTOR":
                return hoursWorked * hourlyRate;

            case "INTERN":
                double discIntern = .2 * hourlyRate;
                double discndIntern = hourlyRate - discIntern;
                if(hoursWorked<=20){
                    weekPay = discndIntern * discndIntern;
                }else {
                    weekPay = discndIntern * 20;
                }

            default:
                System.out.println("Error: Invalid Employee Type. Please select a FULL_TIME, PART_TIME, CONTRACTOR, INTERN.");
                break;
        }
        return weekPay;
    }
    // Method to calculate tax deduction based on pay brackets
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double tax = 0;

        if (grossPay <= 500) {
            tax = grossPay * 0.10;
        } else if (grossPay <= 1000) {
            tax = grossPay * 0.15;
        } else if (grossPay <= 2000) {
            tax = grossPay * 0.20;
        } else {
            tax = grossPay * 0.25;
        }

        if (hasHealthInsurance) {
            tax = tax - 50;
        }

        return tax;
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
        calculateWeeklyPay(types[0],hours[0],rates[0]);
        calculateTaxDeduction(50000,false);
// Then process the entire payroll
// Show all results clearly

    }
}
