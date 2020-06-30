import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExtendingThread extends Thread{
    private Counter counter;

    public ExtendingThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            PrintStream fileOut = new PrintStream("src/main/java/output.txt");
            System.setOut(fileOut);
            System.out.println("Thread class has been created");
            while (counter.getCounter() < 100) {
                counter.increase();
                System.out.println("Thread counter = " + counter.getCounter());
            }
            System.out.println("Thread has died");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
