public class Main {
    public static void showBook(String bookName, int yearOfPublication, String authorName) {
        System.out.println("Книга: " + "\"" + bookName + "\"" + " издание " + yearOfPublication + " года. Писатель: " + authorName);
    }


    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author fedorDostoevskiy = new Author("Фёдор", "Достоевский");
        Author alexPuskin = new Author("Александр", "Пушкин");

        Book one = new Book("Война и мир", 1865, levTolstoy);
        Book two = new Book("Идиот", 1868, fedorDostoevskiy);
        Book three = new Book("Капитанская дочка", 1836, alexPuskin);

        one.setYearOfPublication(2022);
        showBook(one.getBookName(), one.getYearOfPublication(), levTolstoy.getFirstName() + " " + levTolstoy.getMiddleName());

        showBook(two.getBookName(), two.getYearOfPublication(), fedorDostoevskiy.getFirstName() + " " + fedorDostoevskiy.getMiddleName());

        System.out.println("\n" + alexPuskin);
        System.out.println(one + "\n");

        System.out.println(levTolstoy.equals(alexPuskin));
        System.out.println(alexPuskin.equals(fedorDostoevskiy) + "\n");

        System.out.println(levTolstoy.hashCode());
        System.out.println(fedorDostoevskiy.hashCode());
        System.out.println(alexPuskin.hashCode());







    }

}
// by Igor