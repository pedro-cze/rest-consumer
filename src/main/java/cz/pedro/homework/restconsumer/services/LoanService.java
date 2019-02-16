package cz.pedro.homework.restconsumer.services;

import cz.pedro.homework.restconsumer.controllers.LoanController;
import cz.pedro.homework.restconsumer.dtos.LoanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LoanService {

    @Autowired
    private LoanController loanController;

    @Scheduled(fixedRate = 5 * 60000)
    public void fetchAndPrintLoans() {

        final Collection<LoanDTO> loans = loanController.fetchLoans().getBody();

        loans.forEach(loan -> System.out.println(loan.toString()));

    }

}
