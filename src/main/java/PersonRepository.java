import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap<>(Map.of("1", new Person("1", "Florian", "Weber")));

    public Optional<Person> findPersonById(String id) {
        return Optional.ofNullable(persons.get(id));
    }
}
