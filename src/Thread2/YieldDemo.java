package Thread2;

public class YieldDemo extends Thread {
    public static void main(String[] args) throws  InterruptedException {
        YieldDemo demo = new YieldDemo();
        Thread t = new Thread(demo);
        t.start();
        for (int i = 0; i < 1000; i++) {
            if (i%20==0) {
               Thread.yield();
            }
            System.out.println("main......"+i);
        }

    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("yield"+i);
        }
    }
}
