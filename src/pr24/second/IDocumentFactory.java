package pr24.second;

public class IDocumentFactory {
    public static IDocument getIDocument(DocumentAbstractFactory factory) {
        return  factory.createDocument();
    }
}
