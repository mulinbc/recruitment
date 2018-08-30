package exam._4;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testAdd() {
        int a = 1, b = 2;
        int expected = 3;

        int actual = new Solution().add(a, b);
        assertEquals(expected, actual);
    }
}
