public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        ExtendingThread thread1 = new ExtendingThread(counter);
        ImplementingRunnable thread2 = new ImplementingRunnable(counter);
        Thread thread = new Thread(thread2);
        thread1.start();
        thread.start();
    }
}
