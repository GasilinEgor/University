package pr6.first;

public class Main {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(5, 7, 2, 2, 5);
        movableCircle.moveUp();
        movableCircle.moveUp();
        System.out.println(movableCircle.getCenter().getX());
        System.out.println(movableCircle.getCenter().getY());
    }
}
