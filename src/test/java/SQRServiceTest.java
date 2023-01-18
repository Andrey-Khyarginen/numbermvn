import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.main.SQRService;
public class SQRServiceTest {
    @Test
    public void testFirstNumberRange() {
        SQRService service = new SQRService();

        int expected = 15;
        int actual = service.calcSQRt(200, 300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSecondNumberRange() {
        SQRService service = new SQRService();

        int expected = 16;
        int actual = service.calcSQRt(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
