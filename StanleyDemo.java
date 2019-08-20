class NumberCounter2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " finished");
    }
}

public class StanleyDemo {
    public static void main(String[] args) {
        Runnable r1 = new NumberCounter2();
        Runnable r2 = new NumberCounter2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}