import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ExceptionsTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        new ArrayList<Integer>().get(0);
    }

    @Test()
    public void testIndexOutOfBoundsExceptionFail() {
        try{
            new ArrayList<Integer>().get(0);
        } catch (IndexOutOfBoundsException exception){
            Assert.assertNotSame(exception, new NullPointerException());
        }
    }

    @Test(expected = CustomException.class)
    public void testCustomException() throws CustomException {
        RocheTestClass.returnException();
    }

    @Test()
    public void testCustomExceptionFail() {
        try {
            RocheTestClass.returnException();
        } catch (CustomException exception) {
            Assert.assertNotSame(exception, new IndexOutOfBoundsException());
        }
    }
}
