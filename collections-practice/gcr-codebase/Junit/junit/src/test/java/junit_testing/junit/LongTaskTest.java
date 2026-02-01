package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class LongTaskTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTaskTimeout() throws InterruptedException {
        LongTask task = new LongTask();
        task.longRunningTask();  
    }
}
