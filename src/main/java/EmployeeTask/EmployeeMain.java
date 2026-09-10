package EmployeeTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args){
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Anu","CSE",2000),
                new Employee(2,"Manu","EC",2500),
                new Employee(3,"Renu","CSE",5000),
                new Employee(4,"Sanu","CSE",8000),
                new Employee(5, "Sanju", "EI", 4000),
                new Employee(9, "sanusha", "EI", 9000),
                new Employee(10, "Manju", "EI", 4000));

        // COUNT EMPLOYEES IN EACH DEPARTMENT
        Map<String, Long> count = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));
        for (Map.Entry<String, Long> entry : count.entrySet()) {
            System.out.println("Department  : " + entry.getKey() + "  Count  : " + entry.getValue());
        }



    }
}
