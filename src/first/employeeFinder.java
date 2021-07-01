package first;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private String designation;
    private String salary;

    public Employee1(String designation, String salary) {
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "designation='" + designation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
public class employeeFinder{
    public static void main(String[] args) {
        Employee1 emp=new Employee1("manager","10");
        Employee1 emp1=new Employee1("employee","5");
        Employee1 emp2=new Employee1("employee","1");
        List<Employee1> empobjects=new ArrayList<>();
        empobjects.add(emp);
        empobjects.add(emp1);
        empobjects.add(emp2);
        List<Employee1> empresult=empobjects.stream().filter(employee1 -> employee1.getDesignation()=="manager").collect(Collectors.toList());
        System.out.println(empobjects.toString());
    }
        }