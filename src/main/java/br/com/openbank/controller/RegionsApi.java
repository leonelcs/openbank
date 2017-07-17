package br.com.openbank.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.openbank.commons.model.Account;
import br.com.openbank.commons.model.Campaign;
import br.com.openbank.commons.model.Profile;
import br.com.openbank.commons.model.Transaction;
import io.swagger.annotations.Api;

@Api(value = "regions", description = "the mobile Open Bank API")
public interface RegionsApi {
	
	ResponseEntity<List<Transaction>> transactionsGet(String customerId,String accountId);
	

    ResponseEntity<List<Profile>> profilesGet(String customerId);



    ResponseEntity<List<Account>> accountsGet(String customerId);



    ResponseEntity<List<Campaign>> campaignsGet(String customerId);

}
