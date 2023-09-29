package pr6.first;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;


    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }


    public int getRadius() {
        return radius;
    }


    public MovablePoint getCenter() {
        return center;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }


    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }


    @Override
    public void moveRight() {
        this.center.moveRight();
    }


    @Override
    public void moveDown() {
        this.center.moveDown();
    }


    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }
}
