import java.util.*;

public class PersonListRepository {
    private List<Person> persons = new ArrayList<>();

    public Optional<Person> findPersonById(String id) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).id().equals(id)){
                return Optional.of(persons.get(i));
            }
        }

        return Optional.empty();
    }
}
