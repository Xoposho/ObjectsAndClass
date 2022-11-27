import java.util.Objects;

public class Author {
    private final String FIRSTNAME;
    private final String MIDDLENAME;

    public Author(String firstName, String middleNam) {
        this.FIRSTNAME = firstName;
        this.MIDDLENAME = middleNam;
    }

    public String getFirstName() {
        return FIRSTNAME;
    }

    public String getMiddleName() {
        return MIDDLENAME;
    }

    @Override
    public String toString() {
        return FIRSTNAME + " " + MIDDLENAME;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null || other.getClass() != getClass()) {
            return false;
        }
        Author aut = (Author) other;
        return Objects.equals(aut.FIRSTNAME, FIRSTNAME) && Objects.equals(aut.MIDDLENAME, MIDDLENAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIRSTNAME, MIDDLENAME);
    }

}
// by Igor