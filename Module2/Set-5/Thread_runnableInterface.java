class NumberTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class MessageTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message: Hello");
        }
    }
}

class Thread_runnableInterface {

    public static void main(String[] args) {

        NumberTask n = new NumberTask();
        MessageTask m = new MessageTask();

        Thread t1 = new Thread(n);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();
    }
}
