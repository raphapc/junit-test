import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class CustomFailMessagesTest {

    @Test
    public void TestAssertTrueCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertTrue.";
        try {
            Assert.assertTrue(failureMessage, RocheTestClass.returnBoolean("false"));
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertFalseCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertFalse.";
        try {
            Assert.assertFalse(failureMessage, RocheTestClass.returnBoolean("true"));
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertNullCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertNull.";
        try {
            Assert.assertNull(failureMessage, RocheTestClass.returnObject("Roche JUnit Qualification"));
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertNotNullCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertNotNull.";
        try {
            Assert.assertNotNull(failureMessage, RocheTestClass.returnObject(""));
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertSameCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertSame.";
        try {
            Assert.assertSame(failureMessage,  RocheTestClass.returnObject("Roche JUnit Qualification"), null);
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertNotSameCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertNotSame.";
        try {
            Assert.assertNotSame(failureMessage, RocheTestClass.returnObject("Roche JUnit Qualification"),
                    RocheTestClass.returnObject("Roche JUnit Qualification"));
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertEqualsCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertEquals.";
        try {
            Assert.assertEquals(failureMessage, RocheTestClass.returnObject("Roche JUnit Qualification"), "Roche JUnit Qualificatio");
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertNotEqualsCustomFailMessage (){
        String assertionError = null;
        String failureMessage = "Expected Fail message assertNotEquals.";
        try {
            Assert.assertNotEquals(failureMessage, RocheTestClass.returnObject("Roche JUnit Qualification"), "Roche JUnit Qualification");
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }

    @Test
    public void TestAssertArrayEqualsCustomFailMessage (){
        int[] expectedArray = {3, 2, 1};
        String assertionError = null;
        String failureMessage = "Expected Fail message assertArrayEquals.";
        try {
            Assert.assertArrayEquals(failureMessage, RocheTestClass.returnArray(), expectedArray);
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }
        Assert.assertThat(assertionError, StringContains.containsString(failureMessage));
    }
}
