import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestSpeakNumbers {
    SpeakNumbers s;
    ByteArrayInputStream in;
    ByteArrayOutputStream out;

    @BeforeMethod
    public void setUp() throws Exception {
        s = new SpeakNumbers();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.setIn(System.in);
    }

    @Test
    public void testSpeak() throws IOException {
        in = new ByteArrayInputStream("456".getBytes());
        System.setIn(in);
        s.printWords(new Scanner(System.in));
        assert(out.toString().contains("Four Hundred And Fifty Six"));
    }

    @Test
    public void testSpeakExit() throws IOException {
        in = new ByteArrayInputStream("0".getBytes());
        System.setIn(in);
        s.printWords(new Scanner(System.in));
        assert(out.toString().contains(""));
    }

    @Test
    public void testSpeakOutOfRange() throws IOException {
        in = new ByteArrayInputStream("1001".getBytes());
        System.setIn(in);
        s.printWords(new Scanner(System.in));
        assert(out.toString().contains("Wrong number."));
    }
}
