import java.util.Objects;

public class Fullname {
    private final String firstName;
    private final String lastName;

    public Fullname(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fullname fullname = (Fullname) o;
        return Objects.equals(firstName, fullname.firstName) && Objects.equals(lastName, fullname.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
