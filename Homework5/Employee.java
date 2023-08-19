package Homework5;

public class Employee extends Person {

    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (getAge() < 18) {
            return 0;
        } else {
            return daySalary * 1.5 * hours;
        }
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Daily Salary: " + daySalary);
    }
}



