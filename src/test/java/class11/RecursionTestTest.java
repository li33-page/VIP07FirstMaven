package class11;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTestTest {

    RecursionTest rt=new RecursionTest();

    @Test
    public void jiecheng() {
        assertEquals(RecursionTest.jiecheng(5),120);
    }

    @Test
    public void phib() {
        assertEquals(rt.phib(15),64);
    }

    @Test
    public void phibArray() {
        assertEquals(rt.phibArray(1),88);
    }
}