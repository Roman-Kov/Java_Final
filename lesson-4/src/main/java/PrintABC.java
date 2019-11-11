public class PrintABC {
    private volatile char printStatus = 'A';

    public PrintABC() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5 ; i++) {
                    printA();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5 ; i++) {
                    printB();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5 ; i++) {
                    printC();
                }
            }
        });

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        t1.start();
        t2.start();
        t3.start();
    }


    public synchronized void printA(){
        while (printStatus != 'A') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("A");
        printStatus = 'B';
        notifyAll();
    }

    public synchronized void printB(){
        while (printStatus != 'B') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("B");
        printStatus = 'C';
        notifyAll();
    }

    public synchronized void printC(){
        while (printStatus != 'C') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("C||");
        printStatus = 'A';
        notifyAll();
    }
}
