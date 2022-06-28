import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void shouldCalculateNumberOfSquaresExceedingMinimumLimit () {

        int expected = 0;
        int minLimit = 10;
        int maxLimit = 99;

        int actual = SQRService.calcSQR(minLimit, maxLimit);

        assertEquals (expected, actual);
        }

        @Test
    public void shouldCalculateNumberOfSquaresMinimumLimit () {

        int expected = 1;
        int minLimit = 100;
        int maxLimit = 100;

        int actual = SQRService.calcSQR(minLimit, maxLimit);

        assertEquals (expected, actual);
        }


    @Test
    public void shouldCalculateNumberOfSquaresMaximumLimit () {

        int expected = 3;
        int minLimit = 200;
        int maxLimit = 300;

        int actual = SQRService.calcSQR(minLimit, maxLimit);

        assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSquaresExceedingMaximumLimit () {
        int expected = 84;
        int minLimit = 200;
        int maxLimit = 100_000;

        int actual = SQRService.calcSQR(minLimit, maxLimit);

        assertEquals (expected, actual);
    }
    }
