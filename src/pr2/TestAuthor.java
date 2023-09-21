package pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Egor", "eg.gasilin2018@yandex.ru", 'f');
        System.out.println(author.getName()); //Данная реализация функции main нужна для показа работоспособности кода
        System.out.println(author.getEmail());
        System.out.println(author.getGenger());
        author.setEmail("eg.gasilin@yandex.ru");
        System.out.println(author);
    }
}

class Author {
    private String name;
    private String email;
    private char genger;

    public Author(String name, String email, char genger)
    {
        this.name = name;
        this.email = email;
        this.genger = genger;
    }


    public String getName()
    {
        return this.name;
    }


    public String getEmail()
    {
        return this.email;
    }


    public void setEmail(String email)
    {
        this.email = email;
    }


    public char getGenger() {
        return genger;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", genger=" + genger +
                '}';
    }
}
