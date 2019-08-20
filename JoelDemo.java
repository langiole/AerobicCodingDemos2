class SynchronizedBlock {
    public void run() {
        synchronized(this) {
            System.out.println("Thread-" + Thread.currentThread().getId() + " has started");
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread-" + Thread.currentThread().getId() + " : " + i);
            }
        }
    }
}

class JoelCounter extends Thread {
    SynchronizedBlock sb;

    @Override
    public void run() {
        sb.run();
    }
}

public class JoelDemo {
    public static void main(String[] args) {
        SynchronizedBlock sb = new SynchronizedBlock();
        JoelCounter jc1 = new JoelCounter();
        JoelCounter jc2 = new JoelCounter();

        jc1.sb = sb;
        jc2.sb = sb;

        jc1.run();
        jc1.run();
    }
}