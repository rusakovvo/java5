package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestSQR {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testCalcSQR(int x, int y, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
