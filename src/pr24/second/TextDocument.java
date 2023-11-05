package pr24.second;

public class TextDocument implements IDocument {
    @Override
    public void print() {
        System.out.println("Текстовый документ");
    }
}
