package br.com.openbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.openbank.agregator.RegionsAgregator;
import br.com.openbank.commons.model.Account;
import br.com.openbank.commons.model.Campaign;
import br.com.openbank.commons.model.Profile;
import br.com.openbank.commons.model.Transaction;
import br.com.openbank.service.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService {

	@Autowired
	private RegionsAgregator agregator;
	
	@Override
	public List<Profile> getProfiles(String customerId) {
		return agregator.getProfiles(customerId);
	}

	@Override
	public List<Account> getAccounts(String customerId) {
		return agregator.getAccounts(customerId);
	}

	@Override
	public List<Transaction> getTransactions(String customerId,String accountId) {
		return agregator.getTransactions(customerId,accountId);
	}

	@Override
	public List<Campaign> getCampaings(String customerId) {
		return agregator.getCampaings(customerId);
	}

}
