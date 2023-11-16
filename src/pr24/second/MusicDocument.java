package pr24.second;

public class MusicDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Музыкальный файл открыт");
    }

    @Override
    public void print() {
        System.out.println("Музыка");
    }
}
