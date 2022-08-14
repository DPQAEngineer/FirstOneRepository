import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a = this.getLocalNumber();

        if (a == 14) {
            System.out.println("Test passed: метод getLocalNumber возвращает число 14");
        } else {
            System.out.println("Test failed: метод getLocalNumber не возвращает число 14");
        }
    }
}