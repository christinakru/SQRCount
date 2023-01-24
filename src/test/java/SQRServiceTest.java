import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCountZero(){
        SQRService service = new SQRService();

        int low = 0;
        int high = 99;
        int expected = 0;

        int actual = service.GetNumOfSquares(low, high);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountThree(){
        SQRService service = new SQRService();

        int low = 200;
        int high = 300;
        int expected = 3;

        int actual = service.GetNumOfSquares(low, high);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountAll(){
        SQRService service = new SQRService();

        int low = 100;
        int high = 10000;
        int expected = 89;

        int actual = service.GetNumOfSquares(low, high);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountOne(){
        SQRService service = new SQRService();

        int low = 0;
        int high = 100;
        int expected = 1;

        int actual = service.GetNumOfSquares(low, high);

        assertEquals(expected, actual);
    }
}
