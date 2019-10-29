package MFU;

public class MFU {
    private static Object printLock = new Object();
    private static Object scanLock = new Object();
    protected static enum  Action {PRINT, SCAN};

    public void print(Document doc){
        synchronized (printLock){
            System.out.println("Printing document: " + doc.getDocumentName() + " started");
            for (int i = 1; i <= doc.getCountOfPages(); i++) {
                System.out.println("Printing: " + doc.getDocumentName() + "_PAGE: " + i);
            }
            System.out.println("Printing document: " + doc.getDocumentName() + " finished");
        }

    }

    public void scan(Document doc){
        synchronized (scanLock){
            System.out.println("Scaning document: " + doc.getDocumentName() + " started");
            for (int i = 1; i <= doc.getCountOfPages(); i++) {
                System.out.println("Scaning: " + doc.getDocumentName() + "_PAGE: " + i);
            }
            System.out.println("Scaning document: " + doc.getDocumentName() + " finished");
        }
    }

}
