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

}
// by Igor