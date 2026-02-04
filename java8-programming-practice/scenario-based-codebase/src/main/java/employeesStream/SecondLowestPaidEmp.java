package employeesStream;
import java.util.*;

public class SecondLowestPaidEmp {
	public static void main(String[] args) {
		List<Employees> employees = List.of(
                new Employees(1, "Nageshwar", 28, "Male", "IT", 2019, 65000),
                new Employees(2, "Lucky", 32, "Male", "HR", 2016, 55000),
                new Employees(3, "Himesh", 25, "Male", "Finance", 2021, 48000),
                new Employees(4, "Sneha", 29, "Female", "IT", 2018, 72000),
                new Employees(5, "Priya", 35, "Female", "HR", 2014, 60000),
                new Employees(6, "Aman", 41, "Male", "Admin", 2010, 80000),
                new Employees(7, "Ritika", 26, "Female", "Finance", 2022, 45000),
                new Employees(8, "Rahul", 30, "Male", "IT", 2017, 70000),
                new Employees(9, "Neha", 27, "Female", "Marketing", 2020, 52000),
                new Employees(10, "Karan", 38, "Male", "Marketing", 2012, 90000)
        );
		
		employees.stream().sorted(Comparator.comparingDouble(Employees::getSalary))
		.skip(1).findFirst().ifPresent(e->System.out.println(e));
	}
}
