import java.text.DecimalFormat;

public class Employee {
    String employeeId;
    String name;
    double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void calculatePay() {
    }

    @Override
    public String toString() {
        String format = "%.2f";
        String s = String.format(format, this.averageMonthlySalary);
        return this.employeeId + " " + this.name + " " + s;
    }

}
