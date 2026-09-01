package Class_Learn;

class Updater {
    void update(Counter count) {
        count.counter++;
    }
}

class Counter {
    int counter = 0;
}

public class Call_Ex {
    static void main() {
        Counter myCounter = new Counter();
        System.out.println(myCounter.counter);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println(myCounter.counter);
    }
}
