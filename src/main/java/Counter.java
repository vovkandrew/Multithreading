public class Counter {
    private int counter;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public void increase() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
