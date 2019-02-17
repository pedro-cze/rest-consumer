package cz.pedro.homework.restconsumer.services;

import cz.pedro.homework.restconsumer.controllers.LoanController;
import cz.pedro.homework.restconsumer.dtos.LoanDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class LoanService {

    private static final String BASE_URL = "https://api.zonky.cz/loans/marketplace?datePublished__gt=";
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    private Logger logger = LoggerFactory.getLogger(LoanService.class);

    @Autowired
    private LoanController loanController;
    @Autowired
    private DateTimeService dateTimeService;

    @Scheduled(fixedRate = 5 * 60000)
    public void fetchAndPrintLoans() {
        try {
            final Collection<LoanDTO> loans = loanController.fetchLoans(BASE_URL + getDateString(DATE_FORMAT)).getBody();
            loans.forEach(loan -> logger.info(loan.toString()));
        } catch (HttpClientErrorException e) {
            logger.error("An error occurred during request: {}", e.getMessage());
        }
    }

    private String getDateString(String dateFormat) {
        return dateTimeService.getDateString(dateFormat, LocalDateTime.now().minusMinutes(5L));
    }

}
