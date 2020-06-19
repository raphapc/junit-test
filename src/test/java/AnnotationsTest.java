import org.junit.*;

public class AnnotationsTest {

    @Test
    public void TestAnnotationTest (){
        System.out.println("Executed @Test.");
        Assert.assertEquals(3, 3);
    }

    @BeforeClass
    public static void TestAnnotationBeforeClass() {
        System.out.println("Executed @BeforeClass.");
    }

    @Before
    public void TestAnnotationBefore() {
        System.out.println("Executed @Before.");
    }

    @After
    public void TestAnnotationAfter() {
        System.out.println("Executed @After.");
    }

    @AfterClass
    public static void TestAnnotationAfterClass() {
        System.out.println("Executed @AfterClass.");
    }

    @Ignore
    @Test
    public void TestAnnotationIgnore() {
        // Ignore class should not be executed
        System.out.println("Executed @Ignore.");
    }

}
