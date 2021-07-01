package first;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String address;
    private int department;

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
}
public class Test6{
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("sayan");
        emp.setAddress("zangalore");
        emp.setDepartment(10);
        Employee emp1=new Employee();
        emp1.setAddress("kolkata");
        emp1.setName("sayan");
        emp1.setDepartment(10);
        List<Employee> list=new ArrayList<>();
        list.add(emp);
        list.add(emp1);
       /* list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               int result=o1.getName().compareTo(o2.getName());
               if(result==0){
                   return o1.getAddress().compareTo(o2.getAddress());
               }
               return result;
            }
        });*/
        Comparator<Employee> e=(p1,p2)->{
            return p1.getName().compareTo(p2.getName());
        };
        e=e.thenComparing((p1,p2)->p1.getAddress().compareTo(p2.getAddress()));
        list.sort(e);
        //list.forEach(employee ->System.out.println(employee.getName()+" "+employee.getAddress()));
        Map<Integer,List<Employee>> listMap=list.stream().collect(Collectors.groupingBy(e1->e1.getDepartment()));
        listMap.forEach((integer, employees) -> System.out.println(integer+" "+employees.size()));
    }
}