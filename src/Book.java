public class Book {
    private final String BOOKNAME;      //автор и название книги не меняется
    private int yearOfPublication;      //менятся лишь год издания, т.к. книга может быть переиздана
    final Author BOOKAUTHOR;

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

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
// by Igor