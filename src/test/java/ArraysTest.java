import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void addition() {
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int actual = Arrays.addition(a, b);

        //THEN
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    void firstLetter() {
        //GIVEN
        String value = "";

        //WHEN
        String actual = getFirstLetter(value);

        //THEN
        assertNull(actual);
        assertEquals(null, actual);
    }

    private String getFirstLetter(String value) {
        return null;
    }
    //TERST
}
