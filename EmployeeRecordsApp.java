import java.util.*;

public class EmployeeRecordsApp {
    public static void main(String[] args) {
        // Sample employee records
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("5001", "Sai", "IT", 50000));
        employees.add(new Employee("5002", "Ashu", "HR", 60000));
        employees.add(new Employee("5003", "Smith", "Finance", 55000));
        employees.add(new Employee("5001", "John", "IT", 50000)); // Duplicate record

        // Step 1: Store employee IDs to a collection
        Set<String> employeeIds = EmployeeRecordsManager.extractEmployeeIds(employees);

        // Step 2: Remove duplicate employee IDs if any and sort them in descending order
        List<String> sortedEmployeeIds = EmployeeRecordsManager.removeDuplicateAndSort(employeeIds);

        // Step 3: Using the above collection, retrieve the employee information and store it against each employee ID into another collection
        Map<String, Employee> employeeInfoMap = EmployeeRecordsManager.mapEmployeeInfo(employees);

        // Step 4: Iterate over the collection created above and print the employee details against each employee ID
        for (String id : sortedEmployeeIds) {
            Employee employee = employeeInfoMap.get(id);
            if (employee != null) {
                System.out.println("Employee ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Department: " + employee.getDepartment());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println();
            }
        }
    }
}
