package racingcar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class IOTestSupport {
    private InputStream sysInBackup;
    private PrintStream sysOutBackup;
    private ByteArrayOutputStream capturedOut;

    protected void givenConsoleInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @BeforeEach
    void setUpIO() {
        sysInBackup = System.in;
        sysOutBackup = System.out;
        capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut));
    }

    @AfterEach
    void tearDownIO() {
        System.setIn(sysInBackup);
        System.setOut(sysOutBackup);
    }

    protected String capturedOutput() {
        return capturedOut.toString(); // 기본 문자셋으로 디코딩
    }
}
