package cz.pedro.homework.restconsumer.controllers;

import cz.pedro.homework.restconsumer.dtos.LoanDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class LoanController {

    private static final String BASE_URL = "https://api.zonky.cz/loans/marketplace";

    private static final Logger logger = LoggerFactory.getLogger(LoanController.class);

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<Collection<LoanDTO>> fetchLoans() {

        logger.info("Sending request to: {}", BASE_URL);

        final ResponseEntity<Collection<LoanDTO>> result = restTemplate.exchange(
                BASE_URL,
                HttpMethod.GET,
                new HttpEntity<>(initHeaders()),
                new ParameterizedTypeReference<Collection<LoanDTO>>() {
                });

        logger.info("Fetched {} loans.", result.getBody().size());

        return result;

    }

    private HttpHeaders initHeaders() {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON_UTF8));
        return httpHeaders;
    }
}

