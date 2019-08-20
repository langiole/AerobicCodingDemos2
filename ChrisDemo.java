class NumberCounter extends Thread {

    @Override
    public synchronized void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " has started");

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
    }
}

public class ChrisDemo {
    public static void main(String[] args) throws InterruptedException {
        NumberCounter t1 = new NumberCounter();
        NumberCounter t2 = new NumberCounter();
        NumberCounter t3 = new NumberCounter();

        t1.start();
        t2.start();
        t3.start();
    }
}
