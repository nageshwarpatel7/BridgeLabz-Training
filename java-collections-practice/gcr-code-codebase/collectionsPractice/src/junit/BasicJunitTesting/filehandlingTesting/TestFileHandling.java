package junit.BasicJunitTesting.filehandlingTesting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class TestFileHandling {
	
	FileOperation fileOp = new FileOperation();

    @TempDir
    Path tempDir; // Automatically creates and deletes a temporary folder

    @Test
    void testWriteAndReadSuccess() throws IOException {
        File tempFile = tempDir.resolve("testfile.txt").toFile();
        String expectedContent = "Hello World";

        // ✅ Test Writing
        fileOp.writeToFile(tempFile.getAbsolutePath(), expectedContent);
        
        // ✅ Test Existence
        assertTrue(tempFile.exists(), "File should exist after writing");

        // ✅ Test Reading
        String actualContent = fileOp.readFromFile(tempFile.getAbsolutePath());
        assertEquals(expectedContent, actualContent, "Content should match");
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        String fakePath = tempDir.resolve("missing.txt").toString();

        // ✅ Test IOException handling
        assertThrows(IOException.class, () -> {
            fileOp.readFromFile(fakePath);
        }, "Reading a non-existent file should throw IOException");
    }
}
