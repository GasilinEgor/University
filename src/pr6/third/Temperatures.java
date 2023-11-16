package pr6.third;

public abstract class Temperatures implements Conventable {


    private double temperature;
    private char type;


    Temperatures(double temperature, char type) {
        this.temperature = temperature;
        this.type = type;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public void setType(char type) {
        this.type = type;
    }


    public double getTemperature() {
        return temperature;
    }


    public char getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Temperatures{" +
                "temperature=" + temperature +
                ", type=" + type +
                '}';
    }


    public void print() {
        System.out.println("Temperature: " + this.getTemperature() + " " + this.getType());
    }

    @Override
    abstract public double convent(Celsius celsius);


    @Override
    abstract public double convent(Kelvin kelvin);

    @Override
    abstract public double convert(Fahrenheit fahrenheit);
}
