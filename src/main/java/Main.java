import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        Person person = personRepository.findPersonById("1")
                .orElseThrow();

        System.out.println(person.id());


//        if (optionalPerson.isPresent()) {
//            System.out.println(optionalPerson.get().toString());
//        }


        System.out.println("------------");

        Person personA = new Person("1", "Florian", "Weber");
        Person personB = new Person("1", "Florian", "Weber");

        System.out.println(personA.equals(personB));
        System.out.println(personA.hashCode());
        System.out.println(personB.hashCode());


        System.out.println("------------");


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("1", "Florian", "Weber"));
        personList.add(new Person("2", "Florian", "Weber"));
        personList.add(new Person("3", "Florian", "Weber"));
        personList.add(new Person("4", "Florian", "Weber"));
        personList.add(new Person("5", "Florian", "Weber"));
        personList.add(new Person("6", "Florian", "Weber"));
        personList.add(new Person("7", "Florian", "Weber"));

        System.out.println(personList);

        for (Person p : personList) {
            if (p.id().equals("7")) {
                System.out.println("Hallo: " + p.id());
            }
            System.out.println(p.id());
        }

        System.out.println("------------");

        personList.stream()
                .map(p -> p.id())
                .forEach(p -> System.out.println(p));

        System.out.println("------------");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();




        long start1 = System.currentTimeMillis();
        IntStream.range(0, 1_000_000)
                .forEach(System.out::println);
        long end1 = System.currentTimeMillis();

        System.out.println("loop: " + (end - start));
        System.out.println("stream: " + (end1 - start1));
    }
}
