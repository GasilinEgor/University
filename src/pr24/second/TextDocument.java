package pr24.second;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Текстовый докуменнт открыт");
    }

    @Override
    public void print() {
        System.out.println("Текстовый документ");
    }
}
