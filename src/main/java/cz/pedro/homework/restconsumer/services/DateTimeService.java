package cz.pedro.homework.restconsumer.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeService {


    public String getDateString(final String datePattern, final LocalDateTime localDateTime) {

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);

        return localDateTime.format(formatter);

    }

}
