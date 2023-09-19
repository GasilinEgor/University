package pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(); // Данная реализация функции main нужна для показа работоспособности кода
        Ball ball2 = new Ball(1, 5);
        System.out.println(ball2.getX());
        System.out.println(ball2.getY());
        ball1.setX(5.5);
        ball1.setY(1.2);
        ball2.setXY(6.5, 3.7);
        ball1.move(1.2, 6.9);
        System.out.println(ball1.toString());
    }
}


class Ball {
    private double x;
    private double y;

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    public Ball()
    {
        this.x = 0.0;
        this.y = 0.0;
    }


    public double getX()
    {
        return this.x;
    }


    public double getY() {
        return y;
    }


    public void setX(double x) {
        this.x = x;
    }


    public void setY(double y) {
        this.y = y;
    }


    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    public void move(double xDisp, double yDisp)
    {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}