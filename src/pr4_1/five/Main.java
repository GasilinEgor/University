package pr4_1.five;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Гасилин Е. Д.", 1, "Программная инженерия", "12.02.2004", "8(926)917-56-06"),
                new Reader("Гаджиев Э.Г.", 2, "Информационная безопасность", "06.02.2005", "8(925)917-56-06")
        };
        String[] books = {"Капитанская дочка", "Война и мир"};
        Book[] book = {new Book("Гоголь", "Мертвые души"), new Book("Ремарк", "На западном фронте без перемен...")};
        readers[0].takeBook(3);
        readers[1].takeBook(books);
        readers[0].takeBook(book);
        readers[1].returnBook(5);
        readers[0].returnBook(books);
        readers[1].returnBook(book);
    }
}
