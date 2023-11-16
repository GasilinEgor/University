package pr6.third;

public class Celsius extends Temperatures {


    Celsius(double temperature) {
        super(temperature, 'C');
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double convent(Celsius celsius) {
        return this.getTemperature();
    }

    @Override
    public double convent(Kelvin kelvin) {
        return kelvin.getTemperature() - 273;
    }

    @Override
    public double convert(Fahrenheit fahrenheit) {
        return fahrenheit.getTemperature() * 5 / 9 - 32;
    }
}
