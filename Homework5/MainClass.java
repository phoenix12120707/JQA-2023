package Homework5;

public class MainClass {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Student("Hristo", 35, true, 5.5);
        people[1] = new Employee("Alex", 30, true, 150);
        people[2] = new Student("Emi", 17, false, 6);
        people[3] = new Employee("Michael", 19, true, 80);
        people[4] = new Student("Andrei", 18, true, 5.5);
        people[5] = new Employee("Georgi", 16, true, 150);
        people[6] = new Student("Desi", 31, false, 4.0);
        people[7] = new Employee("Yana", 30, false, 150);
        people[8] = new Student("Boris", 20, true, 2.00);
        people[9] = new Employee("Alexandra", 30, false, 250);



        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else {
                person.showPersonInfo();
            }
            System.out.println();
        }

        for (Person person : people) {
            if (person instanceof Employee) {
                double overtimeAmount = ((Employee) person).calculateOvertime(2);
                System.out.println(person.getName() + " overtime amount: " + overtimeAmount);
            }
        }
    }
}
