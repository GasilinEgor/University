package pr6.third;

public class Main {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(30);
        Fahrenheit fahrenheit = new Fahrenheit(celsius);
        Kelvin kelvin = new Kelvin(celsius);

        celsius.print();
        fahrenheit.print();
        kelvin.print();
    }
}
