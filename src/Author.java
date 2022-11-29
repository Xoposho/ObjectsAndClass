import java.util.Objects;

public class Author {
    private final String firstName;
    private final String middleName;

    public Author(String firstName, String middleNam) {
        this.firstName = firstName;
        this.middleName = middleNam;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null || other.getClass() != getClass()) {
            return false;
        }
        Author aut = (Author) other;
        return Objects.equals(aut.firstName, firstName) && Objects.equals(aut.middleName, middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName);
    }

}
// by Igor