package pr24.second;

public class ImageDocumentFactory implements DocumentAbstractFactory {
    @Override
    public IDocument createDocument() {
        return new ImageDocument();
    }
}
