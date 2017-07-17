package br.com.openbank.agregator.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.openbank.agregator.RegionsAgregator;
import br.com.openbank.commons.model.Account;
import br.com.openbank.commons.model.Campaign;
import br.com.openbank.commons.model.Profile;
import br.com.openbank.commons.model.Transaction;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@Repository
public class RegionsAgregatorImpl implements RegionsAgregator {

	private static final PodamFactoryImpl FACTORY;

	static {
		FACTORY = new PodamFactoryImpl();
	}
	
	@Override
	public List<Profile> getProfiles(String customerId) {

		List<Profile> profiles = new ArrayList<>();
		Profile profile = new Profile();
		profile.setBirthDay(new Date());
		profile.setLastName("Perez");
		profile.setName("Jhon");
		profile.setProfileId("1");
		profile.setSecondLastName("Doe");
		profiles.add(profile);
		
		return profiles;
	}

	@Override
	public List<Account> getAccounts(String customerId) {
		List<Account> accounts = new ArrayList<>();
		accounts.add(FACTORY.manufacturePojo(Account.class));
		accounts.add(FACTORY.manufacturePojo(Account.class));
		accounts.add(FACTORY.manufacturePojo(Account.class));
		accounts.add(FACTORY.manufacturePojo(Account.class));
		accounts.add(FACTORY.manufacturePojo(Account.class));
		return accounts;
	}

	@Override
	public List<Transaction> getTransactions(String customerId,String accountId) {
		List<Transaction> transaction = new ArrayList<>();
		transaction.add(FACTORY.manufacturePojo(Transaction.class));
		transaction.add(FACTORY.manufacturePojo(Transaction.class));
		transaction.add(FACTORY.manufacturePojo(Transaction.class));
		transaction.add(FACTORY.manufacturePojo(Transaction.class));
		transaction.add(FACTORY.manufacturePojo(Transaction.class));
		return transaction;
	}
	
	@Override
	public List<Campaign> getCampaings(String customerId) {
		List<Campaign> campaigns = new ArrayList<>();
		campaigns.add(FACTORY.manufacturePojo(Campaign.class));
		campaigns.add(FACTORY.manufacturePojo(Campaign.class));
		campaigns.add(FACTORY.manufacturePojo(Campaign.class));
		campaigns.add(FACTORY.manufacturePojo(Campaign.class));
		campaigns.add(FACTORY.manufacturePojo(Campaign.class));
		return campaigns;
	}
}
