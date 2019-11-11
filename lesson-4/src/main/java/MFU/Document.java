package MFU;

public class Document {
    private String documentName;
    private int countOfPages;

    public Document(String documentName, int countOfPages) {
        this.documentName = documentName;
        this.countOfPages = countOfPages;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getCountOfPages() {
        return countOfPages;
    }
}
