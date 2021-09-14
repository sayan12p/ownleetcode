package first;



import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static class Employee{
        public String id;
        public String name;
        public List<String> skills;

    public Employee(){}

        public Employee(String id, String name, List<String> skills) {
            this.id = id;
            this.name = name;
            this.skills = skills;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(Arrays.asList(new Employee("1", "sayan", new ArrayList<>(Arrays.asList("java", "cobol", "hq"))),
                new Employee("2", "shubham", new ArrayList<>(Arrays.asList("java", "c++", "hive"))),
                new Employee("3", "sarthak", new ArrayList<>(Arrays.asList("java", "python", "cobol")))));
        Set<List<String>> set=new HashSet<>();
        set.add(list.get(0).skills);
        set.add(list.get(1).skills);
        set.add(list.get(2).skills);
        System.out.println(set.stream().flatMap(p->p.stream()).collect(Collectors.toSet()));

    }
    }


