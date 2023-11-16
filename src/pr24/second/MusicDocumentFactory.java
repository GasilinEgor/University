package pr24.second;

public class MusicDocumentFactory implements DocumentAbstractFactory {
    @Override
    public IDocument createDocument() {
        return new MusicDocument();
    }
}
