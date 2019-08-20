class NumberCounter3 extends Thread {
    Sync s;

    @Override
    public void run() {
        s.run();
    }
}

class Sync {
    public synchronized void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " has started");

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
    }
}

public class DonelysDemo {
    public static void main(String[] args) throws InterruptedException {
        Sync s = new Sync();
        NumberCounter3 t1 = new NumberCounter3();
        NumberCounter3 t2 = new NumberCounter3();
        NumberCounter3 t3 = new NumberCounter3();

        t1.s = s;
        t2.s = s;
        t3.s = s;

        t1.start();
        t2.start();
        t3.start();
    }
}
