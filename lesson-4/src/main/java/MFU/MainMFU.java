package MFU;

public class MainMFU {

    public static void main(String[] args) {
        MFU mfu = new MFU();
        Document doc_1 = new Document("Doc1", 4);
        Document doc_2 = new Document("Doc2", 3);
        Document doc_3 = new Document("Doc3", 5);
        Document doc_4 = new Document("Doc4", 6);

        Thread t1 = new Thread(new Job(doc_1, mfu, MFU.Action.PRINT));
        Thread t2 = new Thread(new Job(doc_2, mfu, MFU.Action.PRINT));
        Thread t3 = new Thread(new Job(doc_3, mfu, MFU.Action.SCAN));
        Thread t4 = new Thread(new Job(doc_4, mfu, MFU.Action.SCAN));

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
