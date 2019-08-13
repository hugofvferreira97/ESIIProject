import org.junit.Test;

import static org.junit.Assert.*;

public class ESIIFunctionsTest {

    @Test
    public void returnOne() {

        assertEquals(1, new ESIIFunctions().returnOne());
    }

    @Test
    void failReturnOne() {
        assertEquals(2, new ESIIFunctions().returnOne());
    }
}