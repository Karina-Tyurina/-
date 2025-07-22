//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");

        Book book1 = new Book("Онегин ", author1, 1833);
        Book book2 = new Book("Война и мир ", author2, 1869);

        book1.setYear(1956);

        System.out.println("Книга: " + book1.getName() + ", Автор: " +
                book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName()
                + ", Год публикации: " + book1.getYear());
        System.out.println("Книга: " + book2.getName() + ", Автор: " +
                book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", Год публикации: " + book2.getYear());
    }
}
