public class Main {
    public static void showBook(String bookName, int yearOfPublication, String authorName) {
        System.out.println("Книга: " + "\"" + bookName + "\"" + " издание " + yearOfPublication + " года. Писатель: " + authorName);
    }


    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author fedorDostoevskiy = new Author("Фёдор", "Достоевский");

        Book one = new Book("Война и мир", 1865, levTolstoy);
        one.setYearOfPublication(2022);
        showBook(one.getBookName(), one.getYearOfPublication(), levTolstoy.getFirstName() + " " + levTolstoy.getMiddleName());

        Book two = new Book("Идиот", 1868, fedorDostoevskiy);
        showBook(two.getBookName(), two.getYearOfPublication(), fedorDostoevskiy.getFirstName() + " " + fedorDostoevskiy.getMiddleName());

    }
}