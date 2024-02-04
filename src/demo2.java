import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee {
    private String name;
    private String address;
    private int department;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
public class demo2{


    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5,6,8,9};
        Employee emp=new Employee();
        emp.setName("sayan");
        emp.setAddress("zangalore");
        emp.setDepartment(10);
        emp.setSalary(107658);
        Employee emp1=new Employee();
        emp1.setAddress("kolkata");
        emp1.setName("sayan");
        emp1.setDepartment(10);
        emp1.setSalary(155687);
        Employee emp2=new Employee();
        emp2.setAddress("kolkata");
        emp2.setName("shubham");
        emp2.setDepartment(10);
        emp2.setSalary(155687);
        List<Employee> list=new ArrayList<>();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        System.out.println( Arrays.stream(numbers).map(x->x*2).collect(Collectors.toList()));
        // find developer with highest pay
        BinaryOperator<Employee> employeeBinaryOperator = BinaryOperator.minBy(Comparator.comparing(Employee::getSalary));
        Employee employee =  list.stream().reduce(emp,employeeBinaryOperator);
        Map<String,Double> map=list.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.summingDouble(Employee::getSalary)));
        System.out.println(map);
    }

}