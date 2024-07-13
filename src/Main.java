public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sukhdeep", "Kaur", 3111, 19.5, 6.0);
        // Ensure you are providing all the required arguments
        // with correct types and in the right order.

        emp.setHeight(5.7);
        System.out.println(emp);
        System.out.println("Hourly Pay after raise: $" + emp.getRaise());
        int hoursWorked = 45;
        System.out.println("Total pay for " + hoursWorked + " hours: $" + emp.payDay(hoursWorked));
    }
}