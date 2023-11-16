package pr6.third;

public class Kelvin extends Temperatures {


    Kelvin(double temperature) {
        super(temperature, 'K');
    }


    Kelvin(Celsius celsius) {
        super(0, 'K');
        this.setTemperature(this.convent(celsius));
    }


    @Override
    public double convent(Celsius celsius) {
        return celsius.getTemperature() + 273;
    }

    @Override
    public double convent(Kelvin kelvin) {
        return this.getTemperature();
    }

    @Override
    public double convert(Fahrenheit fahrenheit) {
        return (fahrenheit.getTemperature() * 5 / 9 -32) + 273;
    }
}
