package cz.pedro.homework.restconsumer;


import cz.pedro.homework.restconsumer.services.DateTimeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.DateTimeException;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DateTimeServiceTest {

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String INCORRECT_DATE_FORMAT = "x";

    @Autowired
    private DateTimeService dateTimeService;

    @Test
    public void testDateTimeService_getCorrectDate() {
        final LocalDateTime localDateTime = LocalDateTime.of(2019,12,20,9,50, 0);
        Assert.assertEquals("2019-12-20T09:50:00", dateTimeService.getDateString(DATE_FORMAT, localDateTime));
    }

    @Test(expected = DateTimeException.class)
    public void testDateTimeService_getIncorrectDate() {
        dateTimeService.getDateString(INCORRECT_DATE_FORMAT, LocalDateTime.now());
    }

}
