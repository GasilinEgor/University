package pr4_1.five;

public class Reader {
    private String fullName;
    private int number;
    private String fucName;
    private String dateOfBirth;
    private String phoneNumber;


    Reader() {
        this.fullName = "";
        this.number = -1;
        this.fucName = "";
        this.dateOfBirth = "01.01.1979";
        this.phoneNumber = "8(999)999-99-99";
    }


    Reader(String fullName, int number, String fucName, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.number = number;
        this.fucName = fucName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }


    public String getFullName() {
        return fullName;
    }


    public int getNumber() {
        return number;
    }


    public String getFucName() {
        return fucName;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public void setFucName(String fucName) {
        this.fucName = fucName;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void takeBook(int count) {
        System.out.println(this.getFullName() + " взял " + count + " книги");
    }


    public void takeBook(String[] books) {
        System.out.print(this.getFullName() + " взял книги:");
        for (String book: books) {
            System.out.print(" " + book);
        }
        System.out.println();
    }


    public void takeBook(Book[] books) {
        System.out.print(this.getFullName() + " взял книги:");
        for (Book book: books) {
            System.out.print(" " + book.getName());
        }
        System.out.println();
    }


    public void returnBook(int count) {
        System.out.println(this.getFullName() + " вернул " + count + " книги");
    }


    public void returnBook(String[] books) {
        System.out.print(this.getFullName() + " вернул книги:");
        for (String book: books) {
            System.out.print(" " + book);
        }
        System.out.println();
    }


    public void returnBook(Book[] books) {
        System.out.print(this.getFullName() + " вернул книги:");
        for (Book book: books) {
            System.out.print(" " + book.getName());
        }
        System.out.println();
    }


    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", number=" + number +
                ", fucName='" + fucName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
