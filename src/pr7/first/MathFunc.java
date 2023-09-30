package pr7.first;
import java.math.*;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double abs_i(String complex) {
        String[] var;
        if (complex.contains("+")) {
            var = complex.split("+");
        }
        else {
            var = complex.split("-");
        }
        var[0] = var[0].replace(" ", "");
        var[1] = var[1].replace(" ", "").replace("i", "");
        int firstValue = Integer.parseInt(var[0]);
        int secondValue = Integer.parseInt(var[1]);
        return this.pow(this.pow(firstValue, 2) + this.pow(secondValue, 2), 0.5);
    }


    public double getLength(double radius) {
        return 2 * Pi * radius;
    }
}
