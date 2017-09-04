package by.gsu.lesson17;

/**
 * @author vasiliy.pispanen.
 */
public class WaitNotifyExampleMain {
    public static void main(String[] args) {
        Store store = new Store();
        Thread t1 = new Thread(new Producer(store));
        Thread t2 = new Thread(new Consumer(store));

        t1.start();
        t2.start();
    }

    static class Store {
        private int products = 0;

        void get() throws InterruptedException {
            synchronized (this) {
                while (products < 1) {
                    wait();
                }
                products--;
                notify();
                System.out.println("got one! total : " + products);
            }

        }

        synchronized void put() throws InterruptedException {
            while (products > 3) {
                wait();
            }
            products++;
            System.out.println("put one! total : " + products);
            notify();
        }
    }

    static class Consumer implements Runnable {
        private Store store;

        public Consumer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    store.get();
                }
            } catch (InterruptedException e) { e.printStackTrace();}

        }
    }

    static class Producer implements Runnable {
        private Store store;

        public Producer(Store store) {
            this.store = store;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    store.put();
                }
            } catch (InterruptedException e) { e.printStackTrace();}

        }
    }
}
