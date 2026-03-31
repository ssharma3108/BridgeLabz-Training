package functionalInterface;
public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable task using lambda
        Runnable backgroundTask = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate long-running task
            } catch (InterruptedException e) {
                System.out.println("Job interrupted");
            }
            System.out.println("Background job completed.");
        };

        // Execute task asynchronously
        Thread thread = new Thread(backgroundTask);
        thread.start();

        System.out.println("Main thread continues execution...");
    }
}
