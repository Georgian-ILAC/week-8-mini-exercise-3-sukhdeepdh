public class Person {
    private String firstName;
    private String lastName;
    private double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected double getHeight() {  // Changed from private to protected
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeight(double height) {  // Changed from private to public
        this.height = height;
    }
}

class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay, double height) {
        super(firstName, lastName);
        this.id = id;
        this.hourlyPay = hourlyPay;

    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for hourlyPay
    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    // Method to give a raise
    public double getRaise() {
        this.hourlyPay *= 1.15; // Increase by 15%
        return this.hourlyPay;
    }

    // Method to calculate weekly pay
    public double payDay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return (regularHours * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s %s\nThey are %.1f' %.1f\"\nThey make $%.2f\nThey have the employee ID %d\n",
                getFirstName(), getLastName(), Math.floor(getHeight() / 12), getHeight() % 12, hourlyPay, id
        );
    }
}
