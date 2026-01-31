package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class FileProcessorTest {

    FileProcessor fp = new FileProcessor();
    String filename = "testfile.txt";

    @Test
    public void testWriteAndReadFile() throws IOException {
        fp.writeToFile(filename, "Hello JUnit");

        String content = fp.readFromFile(filename);
        assertEquals("Hello JUnit", content);
    }

    @Test
    public void testFileExistsAfterWrite() throws IOException {
        fp.writeToFile(filename, "File exists test");

        assertTrue(Files.exists(Path.of(filename)));
    }

    @Test
    public void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> {
            fp.readFromFile("nofile.txt");
        });
    }

    @AfterEach
    public void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(filename));
    }
}
