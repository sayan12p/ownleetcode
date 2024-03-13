package first;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    static class Employee{
        public String id;
        public String name;
        public List<String> skills;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<String> getSkills() {
            return skills;
        }

        public Employee(){}

        public Employee(String id, String name, List<String> skills) {
            this.id = id;
            this.name = name;
            this.skills = skills;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", skills=" + skills +
                    '}';
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
        Map<String, List<List<String>>> collect = list.stream().filter(s->s.getSkills().stream().anyMatch(i->i.contains("c++")))
                .map(e -> new AbstractMap.SimpleEntry<>(e.getName(), e.getSkills()))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
        System.out.println(collect);
    }
    }


