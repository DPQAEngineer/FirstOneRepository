import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int a = this.getClassNumber();

        if (a > 45) {
            System.out.println("Test passed: метод getClassNumber возвращает число больше 45");
        } else {
            System.out.println("Test failed: метод getClassNumber не возвращает число больше 45");
        }
    }
}