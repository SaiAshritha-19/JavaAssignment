import java.util.*;

public class EmployeeRecordsManager {
    public static Set<String> extractEmployeeIds(List<Employee> employees) {
        Set<String> employeeIds = new HashSet<>();
        for (Employee employee : employees) {
            employeeIds.add(employee.getId());
        }
        return employeeIds;
    }

    public static List<String> removeDuplicateAndSort(Set<String> employeeIds) {
        List<String> sortedEmployeeIds = new ArrayList<>(employeeIds);
        Collections.sort(sortedEmployeeIds, Collections.reverseOrder());
        return sortedEmployeeIds;
    }

    public static Map<String, Employee> mapEmployeeInfo(List<Employee> employees) {
        Map<String, Employee> employeeInfoMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeInfoMap.put(employee.getId(), employee);
        }
        return employeeInfoMap;
    }
}
