package pr6.third;

public class Fahrenheit extends Temperatures {


    Fahrenheit(double temperature) {
        super(temperature, 'F');
    }


    Fahrenheit(Celsius celsius) {
        super(0, 'F');
        this.setTemperature(this.convent(celsius));
    }


    @Override
    public double convent(Celsius celsius) {
        return celsius.getTemperature() * 9 / 5 + 32;
    }

    @Override
    public double convert(Fahrenheit fahrenheit) {
        return getTemperature();
    }


    @Override
    public double convent(Kelvin kelvin) {
        return (kelvin.getTemperature() - 273) * 9 / 5 + 32;
    }
}
