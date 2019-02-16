package cz.pedro.homework.restconsumer;

import cz.pedro.homework.restconsumer.controllers.LoanController;
import cz.pedro.homework.restconsumer.dtos.LoanDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestConsumerApplicationTests {

	@Autowired
	private LoanController loanController;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLoanController_getLoans_statusOk() {

	    final ResponseEntity result = loanController.fetchLoans();

        final Collection<LoanDTO> loans = (Collection<LoanDTO>) result.getBody();

		Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals(MediaType.APPLICATION_JSON_UTF8, result.getHeaders().getContentType());
        Assert.assertNotNull(loans);
	}

}

