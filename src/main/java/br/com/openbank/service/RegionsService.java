package br.com.openbank.service;

import java.util.List;

import br.com.openbank.commons.model.Account;
import br.com.openbank.commons.model.Campaign;
import br.com.openbank.commons.model.Profile;
import br.com.openbank.commons.model.Transaction;

public interface RegionsService {

	List<Campaign> getCampaings(String customerId);
	
	List<Profile> getProfiles(String customerId);
	
	List<Account> getAccounts(String customerId);

	List<Transaction> getTransactions(String customerId,String accountId);
}
