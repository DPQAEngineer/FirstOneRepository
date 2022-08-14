import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        String a = this.getClassString();

        if (a.contains("hello")) {
            System.out.println("Test passed: метод getClassString возвращает подстроку - hello");
        } else if (a.contains("Hello")) {
            System.out.println("Test passed: метод getClassString возвращает подстроку - Hello");
        } else {
        System.out.println("Test failed: метод getClassString не возвращает подстроку - hello/ Hello");
    }
    }
}