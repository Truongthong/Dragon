public class SyncDemo {
    public static void main(String[] args) {
        final Counter ct = new Counter();
        // Create new runnable object t1,
        // therefore t1 is a thread is using Counter object ct
        Runnable t1 = new Runnable() {
            public void run() {
                ct.count();
            }
        };
        Runnable t2 = new Runnable() {
            public void run() {
                ct.countdown();
            }
        };
        new Thread(t1).start();
        new Thread(t2).start();
    }

    }
