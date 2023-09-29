package pr6.second;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 5, 1, 1);
        rectangle.moveDown();
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
