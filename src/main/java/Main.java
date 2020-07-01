import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream fileOut = new PrintStream("src/main/java/output.txt");
            System.setOut(fileOut);
            Counter counter = new Counter(0);
            ExtendingThread thread1 = new ExtendingThread(counter);
            ImplementingRunnable thread2 = new ImplementingRunnable(counter);
            Thread thread = new Thread(thread2);
            thread1.start();
            thread.start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
