import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EvenCheckerTest {

    @Test
    void shouldReturnTrueForEvenNumber() {
        assertTrue(EvenChecker.isEven(4));
    }
}