import java.util.Objects;

public class Book {
    private final String BOOKNAME;      //автор и название книги не меняется
    private int yearOfPublication;      //менятся лишь год издания, т.к. книга может быть переиздана
    private final Author BOOKAUTHOR;

    public Book(String bookName, int yearOfPublication, Author bookAuthor) {
        this.BOOKNAME = bookName;
        this.yearOfPublication = yearOfPublication;
        this.BOOKAUTHOR = bookAuthor;
    }

    public String getBookName() {
        return BOOKNAME;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getBOOKAUTHOR() { return BOOKAUTHOR; }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return BOOKNAME + " " + yearOfPublication + " " + BOOKAUTHOR;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null || other.getClass() != getClass()) {
            return false;
        }
        Book b = (Book) other;
        return Objects.equals(b.BOOKNAME, BOOKNAME) && Objects.equals(b.BOOKAUTHOR, BOOKAUTHOR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BOOKNAME, yearOfPublication, BOOKAUTHOR);
    }
}
// by Igor