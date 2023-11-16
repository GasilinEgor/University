package pr24.second;

public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Файл изображения открыт");
    }

    @Override
    public void print() {
        System.out.println("Изображение");
    }
}
