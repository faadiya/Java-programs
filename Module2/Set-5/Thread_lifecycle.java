class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is Running");

        try {
            System.out.println("Thread is in Timed Waiting state");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread has completed");
    }
}

class Thread_lifecycle {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        System.out.println("Thread is in New state");

        t.start();

        System.out.println("Thread is in Runnable state");

        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread is in Terminated state");
    }
}
