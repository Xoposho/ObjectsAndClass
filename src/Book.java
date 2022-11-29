import java.util.Objects;

public class Book {
    private final String bookName;      //автор и название книги не меняется
    private int yearOfPublication;      //менятся лишь год издания, т.к. книга может быть переиздана
    private final Author bookAuthor;

    public Book(String bookName, int yearOfPublication, Author bookAuthor) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getBOOKAUTHOR() { return bookAuthor; }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return bookName + " " + yearOfPublication + " " + bookAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null || other.getClass() != getClass()) {
            return false;
        }
        Book b = (Book) other;
        return Objects.equals(b.bookName, bookName) && Objects.equals(b.bookAuthor, bookAuthor) && Objects.equals(b.yearOfPublication, yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearOfPublication, bookAuthor);
    }
}
// by Igor