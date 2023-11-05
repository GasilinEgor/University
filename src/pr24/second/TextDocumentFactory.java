package pr24.second;

public class TextDocumentFactory implements DocumentAbstractFactory {
    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }
}
