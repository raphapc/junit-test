import org.junit.*;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {

    @Test(timeout=50)
    public void testWithTimeout() {
        Assert.assertTrue(RocheTestClass.returnBoolean("true"));
    }
    @Test(timeout=1)
    public void testWithTimeoutFail(){
        InterruptedException exception = null;
        try {
            TimeUnit.SECONDS.sleep(1);
            Assert.assertTrue(RocheTestClass.returnBoolean("true"));
        }catch (InterruptedException e){
            exception = e;
        }
        Assert.assertNotNull(exception);
    }
}
