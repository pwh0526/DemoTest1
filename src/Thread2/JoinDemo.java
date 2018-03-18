package Thread2;

public class JoinDemo extends Thread {
    public static void main(String[] args) throws  InterruptedException{
        JoinDemo demo = new JoinDemo();
        Thread t = new Thread(demo);
        t.start();
        for (int i = 0; i < 1000; i++) {
            if (50 == i) {
               t.join();//main阻塞
            }
            System.out.println("main......"+i);
        }

    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("join"+i);
        }
    }
}
