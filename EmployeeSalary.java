import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            list.add(new Employee(name, salary));
        }

        double totalSalary = 0;

        System.out.println("\n--- Employee Salary Details ---");
        for (Employee e : list) {
            System.out.println("Name: " + e.name + " | Salary: " + e.salary);
            totalSalary += e.salary;
        }

        double averageSalary = totalSalary / n;

        System.out.println("\nAverage Salary: " + averageSalary);

        sc.close();
    }
}
