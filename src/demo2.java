import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee {
    private String name;
    private Department department;
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee(String name, Department department, BigDecimal salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class demo2{


    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5,6,8,9};
//        Employee emp=new Employee();
//        emp.setName("sayan");
//        emp.setAddress("zangalore");
//        emp.setDepartment(10);
//        emp.setSalary(107658);
//        Employee emp1=new Employee();
//        emp1.setAddress("kolkata");
//        emp1.setName("sayan");
//        emp1.setDepartment(10);
//        emp1.setSalary(155687);
//        Employee emp2=new Employee();
//        emp2.setAddress("kolkata");
//        emp2.setName("shubham");
//        emp2.setDepartment(10);
//        emp2.setSalary(155687);
//        List<Employee> list=new ArrayList<>();
//        list.add(emp);
//        list.add(emp1);
//        list.add(emp2);
//        System.out.println( Arrays.stream(numbers).map(x->x*2).collect(Collectors.toList()));
//        // find developer with highest pay
//        BinaryOperator<Employee> employeeBinaryOperator = BinaryOperator.minBy(Comparator.comparing(Employee::getSalary));
//        Employee employee =  list.stream().reduce(emp,employeeBinaryOperator);
//        Map<String,Double> map=list.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.summingDouble(Employee::getSalary)));
//        System.out.println(map);

        List<Employee> employees = Arrays.asList(new Employee("Vikas",new Department("IT"),new BigDecimal(100)),
                new Employee("Ravi",new Department("Commercial"),new BigDecimal(200)),
                new Employee("Rajni",new Department("Procurment"),new BigDecimal(300)),
                new Employee("Sinha",new Department("Commercial"),new BigDecimal(400)));

        Map<Department,Double> map= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getSalary,Collectors.summingDouble(BigDecimal::doubleValue))));
        map.entrySet().stream().forEach(e->System.out.println(e.getKey() + " " + e.getValue()));
    }

}