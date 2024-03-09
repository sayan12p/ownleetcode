import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;
    String city;

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    Person(int id, String name, String city) {

        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Test3 {
    public static void main(String[] args) {

            List<Person> persons = new ArrayList<>();
            persons.add(new Person(101, "sumit", "pune"));
            persons.add(new Person(102, "mahesh", "pune"));
            persons.add(new Person(103, "sumit", "Banglore"));
            persons.add(new Person(104, "ramesh", "pune"));
            persons.add(new Person(105, "jam", "pune"));
            persons.add(new Person(106, "ramesh", "Mumbai"));



            Map<String,List<Person>> personmap=persons.stream().collect(Collectors.groupingBy(p->p.getCity(),Collectors.toList()));
        System.out.println(personmap.entrySet().stream().filter(s->s.getValue().size()>1).map(e->e.getKey()).collect(Collectors.toList()));

        }
    }

