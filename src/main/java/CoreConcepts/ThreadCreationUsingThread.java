package CoreConcepts;

public class ThreadCreationUsingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Code getting executed by thread:" + Thread.currentThread().getName());
    }
}
