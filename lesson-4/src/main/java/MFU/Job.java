package MFU;

public class Job implements Runnable {
    private Document document;
    private MFU mfu;
    private MFU.Action action;

    public Job(Document document, MFU mfu, MFU.Action action) {
        this.document = document;
        this.mfu = mfu;
        this.action = action;
    }

    @Override
    public void run() {
        if(action == MFU.Action.PRINT) mfu.print(document);
        else mfu.scan(document);
    }
}
