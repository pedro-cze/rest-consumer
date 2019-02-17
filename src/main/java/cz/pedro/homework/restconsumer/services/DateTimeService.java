package cz.pedro.homework.restconsumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeService {

    private static final Logger logger = LoggerFactory.getLogger(DateTimeService.class);
    private static final String EMPTY_STRING = "";

    public String getDateString(final String datePattern, final LocalDateTime localDateTime) {
        try {
            final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);
            return localDateTime.format(formatter);
        } catch (DateTimeException e) {
            logger.error("An error occurred while trying to parse date: {}", e.getMessage());
        }
        return EMPTY_STRING;
    }

}
