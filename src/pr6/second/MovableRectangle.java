package pr6.second;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }


    public MovablePoint getTopLeft() {
        return topLeft;
    }


    public MovablePoint getBottomRight() {
        return bottomRight;
    }


    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }


    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }


    private boolean isEqualSpeed() {
        return this.topLeft.getxSpeed() == this.bottomRight.getxSpeed() && this.topLeft.getySpeed() == this.bottomRight.getySpeed();
    }


    @Override
    public void moveUp() {
        if (isEqualSpeed()) {
            this.topLeft.setY(this.topLeft.getY() + this.topLeft.getySpeed());
            this.bottomRight.setY(this.bottomRight.getY() + this.bottomRight.getySpeed());
        }
        else {
            System.out.println("Ошибка! Скорость точек не одинаковая!");
        }
    }


    @Override
    public void moveDown() {
        if (isEqualSpeed()) {
            this.topLeft.setY(this.topLeft.getY() - this.topLeft.getySpeed());
            this.bottomRight.setY(this.bottomRight.getY() - this.bottomRight.getySpeed());
        }
        else {
            System.out.println("Ошибка! Скорость точек не одинаковая!");
        }
    }


    @Override
    public void moveLeft() {
        if (isEqualSpeed()) {
            this.topLeft.setX(this.topLeft.getX() - this.topLeft.getxSpeed());
            this.bottomRight.setX(this.bottomRight.getX() - this.bottomRight.getxSpeed());
        }
        else {
            System.out.println("Ошибка! Скорость точек не одинаковая!");
        }
    }


    @Override
    public void moveRight() {
        if (isEqualSpeed()) {
            this.topLeft.setX(this.topLeft.getX() + this.topLeft.getxSpeed());
            this.bottomRight.setX(this.bottomRight.getX() + this.bottomRight.getxSpeed());
        }
        else {
            System.out.println("Ошибка! Скорость точек не одинаковая!");
        }
    }
}
