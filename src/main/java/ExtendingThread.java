import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExtendingThread extends Thread{
    private Counter counter;

    public ExtendingThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < 100) {
            counter.increase();
            System.out.println("Thread counter = " + counter.getCounter());
        }
        System.out.println("Thread has died");
    }
}
