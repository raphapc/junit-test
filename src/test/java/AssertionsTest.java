import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AssertionsTest {

    @Test
    public void testEmpty (){

    }

    @Test
    public void testAssertTrue (){
        Assert.assertTrue(RocheTestClass.returnBoolean("true"));
    }

    @Test
    public void testAssertFalse (){
        Assert.assertFalse(RocheTestClass.returnBoolean("false"));
    }

    @Test
    public void testAssertNull (){
        Assert.assertNull(RocheTestClass.returnObject(""));
    }

    @Test
    public void testAssertNotNull (){
        Assert.assertNotNull(RocheTestClass.returnObject("Roche JUnit Qualification"));
    }

    @Test
    public void testAssertSame (){
        Assert.assertSame("Roche JUnit Qualification", "Roche JUnit Qualification");
    }

    @Test
    public void testAssertNotSame (){
        Assert.assertNotSame(RocheTestClass.returnObject("Roche JUnit Qualification"), RocheTestClass.returnObject(""));
    }

    @Test
    public void testAssertEquals (){
        Assert.assertEquals(RocheTestClass.returnObject("Roche JUnit Qualification"), "Roche JUnit Qualification");
    }

    @Test
    public void testAssertNotEquals (){
        Assert.assertNotEquals(RocheTestClass.returnObject("Roche JUnit Qualification"), "Roche JUnit");
    }

    @Test
    public void testAssertArrayEquals (){
        int[] expectedArray = {1, 2, 3};
        Assert.assertArrayEquals(RocheTestClass.returnArray(), expectedArray);
    }

    @Test
    public void testAssertArrayNotEquals (){
        int[] expectedArray = {1, 2, 3, 4};
        Assert.assertFalse(Arrays.equals(RocheTestClass.returnArray(), expectedArray));
    }

}
