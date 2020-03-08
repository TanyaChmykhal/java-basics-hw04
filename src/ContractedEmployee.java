import java.text.DecimalFormat;

public class ContractedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    String employeeId;
    String name;
    String federalTaxId;
    double hourlyRate = 25.33;
    double numberOfHoursWorked = 1.5;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        // TODO fill in code here and replace the return statement
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        // TODO fill in code here
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        // TODO fill in code here and replace the return statement
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void calculatePay() {
        averageMonthlySalary = hourlyRate * numberOfHoursWorked;

    }


}
