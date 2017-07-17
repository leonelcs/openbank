package br.com.openbank.controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.openbank.OpenBankMobilePocApplication;
import br.com.openbank.commons.model.Account;
import br.com.openbank.commons.model.Campaign;
import br.com.openbank.commons.model.Profile;
import br.com.openbank.commons.model.Transaction;

@SpringBootTest(classes = OpenBankMobilePocApplication.class)
@RunWith(SpringRunner.class)
public class RegionsApiTest {

	@Autowired
	private RegionsApi regionsApi;

	@Test
    public void profilesGetTest(){
		ResponseEntity<List<Profile>> response = regionsApi.profilesGet("1");
		assertNotNull(response);
		assertNotNull(response.getBody());
    }

    @Test
    public void accountsGet(){
    	ResponseEntity<List<Account>> response = regionsApi.accountsGet("1");
		assertNotNull(response);
		assertNotNull(response.getBody());
    }

    @Test
    public void transactionsGet(){
    	ResponseEntity<List<Transaction>> response = regionsApi.transactionsGet("1","1");
		assertNotNull(response);
		assertNotNull(response.getBody());
    }
    
    @Test
    public void campaignsGet(){
    	ResponseEntity<List<Campaign>> response = regionsApi.campaignsGet("1");
		assertNotNull(response);
		assertNotNull(response.getBody());
    }

}
