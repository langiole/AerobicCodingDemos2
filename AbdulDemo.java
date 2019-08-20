class Incrementer {
    public void start() {
        for (int i = 0; i < 50; i++) {
            System.out.println("count = " + AbdulDemo.count);
            AbdulDemo.count++;
        }
        notifyAll();
        System.out.println("count = " + AbdulDemo.count);
    }
    public synchronized void incr() {
        while (AbdulDemo.count < 50) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }
        System.out.println("Thread will now increment count by a 100");
        AbdulDemo.count += 100;
    }
}

class MyThread extends Thread {
    Incrementer incr;
    @Override 
    public void run() {
        incr.incr();
    }
}

public class AbdulDemo {
    static int count = 0;
    public static void main(String[] args) {
        Incrementer incr = new Incrementer();
        MyThread t = new MyThread();

        t.incr = incr;
        t.start();

        incr.start();
    }
}