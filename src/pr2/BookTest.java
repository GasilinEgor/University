package pr2;

public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Book book = new Book("name", "author", 1874, 654);
        Book book2 = new Book("name1", "author1", 1489, 546);
        Book book3 = new Book("name2", "author2", 1954, 654);
        Book book4 = new Book("name3", "author3", 1145, 257);
        Book book5 = new Book("name4", "author4", 1870, 186);
        bookshelf.add_book(book);
        bookshelf.add_book(book2);
        bookshelf.add_book(book3);
        bookshelf.add_book(book4);
        bookshelf.add_book(book5);
        System.out.println("Самая ранняя книга: " + bookshelf.earliest_book().toString());
        System.out.println("Самая поздняя книга: " + bookshelf.latest_book().toString());
        bookshelf.years_sort();
        Book[] books = bookshelf.getBooks();
        for (int i = 0; i < bookshelf.getSize(); i++) {
            System.out.println(books[i].toString());
        }
    }
}


class Book {
    private String name;
    private String author;
    private int year;
    private int countOfPages;


    Book() {
        this.name = "";
        this.author = "";
        this.year = 0;
        this.countOfPages = 0;
    }


    Book(String name, String author, int year, int countOfPages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.countOfPages = countOfPages;
    }


    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public int getYear() {
        return year;
    }


    public int getCountOfPages() {
        return countOfPages;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", countOfPages=" + countOfPages +
                '}';
    }
}


class Bookshelf {
    private Book[] books;
    private int size;


    Bookshelf() {
        this.books = new Book[0];
        this.size = 0;
    }


    Bookshelf(Book[] books, int size) {
        this.books = books;
        this.size = size;
    }


    public Book[] getBooks() {
        return books;
    }


    public int getSize() {
        return size;
    }


    public void setBooks(Book[] books) {
        this.books = books;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public void add_book(Book book) {
        Book[] books1 = new Book[this.getSize() + 1];
        for (int i = 0; i < this.getSize(); i++) {
            books1[i] = this.books[i];
        }
        books1[this.getSize()] = book;
        this.setBooks(books1);
        this.setSize(books1.length);
    }


    public Book earliest_book() {
        int min = 3000, index = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.books[i].getYear() < min) {
                min = this.books[i].getYear();
                index = i;
            }
        }
        return this.books[index];
    }


    public Book latest_book() {
        int max = 0, index = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.books[i].getYear() < max) {
                max = this.books[i].getYear();
                index = i;
            }
        }
        return this.books[index];
    }


    public void years_sort() {
        Book book = new Book();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size - i - 1; j++) {
                if (this.books[j].getYear() > this.books[j + 1].getYear()) {
                    book = this.books[j + 1];
                    this.books[j + 1] = this.books[j];
                    this.books[j] = book;
                }
            }
        }
    }
}