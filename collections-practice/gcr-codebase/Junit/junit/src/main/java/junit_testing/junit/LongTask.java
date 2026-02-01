package junit_testing.junit;

public class LongTask {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); 
        return "Done";
    }
}
