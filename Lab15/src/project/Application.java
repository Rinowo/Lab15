package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Khoi", 35));
        persons.add(new Person("Minh", 20));
        persons.add(new Person("Viet Anh", 18));
        persons.add(new Person("Hoang", 40));
        persons.add(new Person("Ngoc", 30));
        persons.add(new Person("My", 30));

        show(persons);

        Collection.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        Collection.sort(persons,((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        }));

        Collection.sort(persons, ((o1, o2) -> Person.compareByName(o1, o2)));
        show(persons);

        System.out.println("Danh sách những người trên 30 tuổi là: ");
        for (Person person :
                persons) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }
    }
    public static void show(ArrayList<Person> persons) {
        persons.forEach(person -> System.out.println(person));
    }
}
