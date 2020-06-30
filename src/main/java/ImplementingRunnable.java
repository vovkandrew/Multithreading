import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ImplementingRunnable implements Runnable{
    private Counter counter;

    public ImplementingRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            PrintStream fileOut = new PrintStream("src/main/java/output.txt");
            System.setOut(fileOut);
            System.out.println("Runnable class has been created");
            while (counter.getCounter() < 100) {
                counter.increase();
                System.out.println("Runnable counter = " + counter.getCounter());
            }
            System.out.println("Runnable has died");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
