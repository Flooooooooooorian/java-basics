import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodenTest {


    @Test
    void isBiggerThen10_When11_ThenTrue() {
        int value = 11;
        boolean expected = true;

        boolean result = Methoden.isBiggerThan10(value);

        assertEquals(expected, result);
    }

    @Test
    void isBiggerThen10_When9_ThenFalse() {
        int value = 9;
        boolean expected = false;

        boolean result = Methoden.isBiggerThan10(value);

        assertEquals(expected, result);
    }

    @Test
    void isBiggerThen10_When10_ThenFalse() {
        int value = 10;
        boolean expected = false;

        boolean result = Methoden.isBiggerThan10(value);

        assertEquals(expected, result);
    }
}
