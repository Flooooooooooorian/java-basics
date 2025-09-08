import java.util.Objects;

public final class Person {
    private final String id;
    private final String firstName;
    private final String lastName;

    public Person(
            String id,
            String firstName,
            String lastName
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String id() {
        return id;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.id, that.id) &&
               Objects.equals(this.firstName, that.firstName) &&
               Objects.equals(this.lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person[" +
               "id=" + id + ", " +
               "firstName=" + firstName + ", " +
               "lastName=" + lastName + ']';
    }

}
