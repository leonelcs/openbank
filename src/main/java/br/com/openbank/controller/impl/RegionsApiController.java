package br.com.openbank.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.openbank.commons.model.Account;
import br.com.openbank.commons.model.Campaign;
import br.com.openbank.commons.model.Profile;
import br.com.openbank.commons.model.Transaction;
import br.com.openbank.controller.RegionsApi;
import br.com.openbank.service.RegionsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class RegionsApiController implements RegionsApi {


	@Autowired
	private RegionsService service;
	
    @ApiOperation(value = "profiles.", notes = "The client profiles", response = Profile.class, responseContainer = "List", tags={ "Profiles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The confirmation code.", response = Profile.class),
        @ApiResponse(code = 204, message = "not content", response = Profile.class),
        @ApiResponse(code = 400, message = "service not found", response = Profile.class),
        @ApiResponse(code = 500, message = "Business service ERROR", response = Profile.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Profile.class) })
    @RequestMapping(value = "/profiles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public ResponseEntity<List<Profile>> profilesGet(@RequestHeader String customerId) {
        return new ResponseEntity<List<Profile>>(service.getProfiles(customerId),HttpStatus.OK);
    }

    @ApiOperation(value = "The accounts", notes = "This endpoint returns a list of accounts.", response = Account.class, responseContainer = "List", tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The confirmation code.", response = Account.class),
        @ApiResponse(code = 204, message = "not content", response = Account.class),
        @ApiResponse(code = 400, message = "service not found", response = Account.class),
        @ApiResponse(code = 500, message = "Business service ERROR", response = Account.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Account.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public ResponseEntity<List<Account>> accountsGet(@RequestHeader String customerId) {
        return new ResponseEntity<List<Account>>(service.getAccounts(customerId),HttpStatus.OK);
    }

    @ApiOperation(value = "transactions from an account", notes = "This endpoint returns a transaction list", response = Campaign.class, responseContainer = "List", tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The confirmation code.", response = Transaction.class),
        @ApiResponse(code = 204, message = "not content", response = Transaction.class),
        @ApiResponse(code = 400, message = "service not found", response = Transaction.class),
        @ApiResponse(code = 500, message = "Business service ERROR", response = Transaction.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Transaction.class) })
    @RequestMapping(value = "/account/{accountId}/transactions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public ResponseEntity<List<Transaction>> transactionsGet(@RequestHeader String customerId,@PathVariable @ApiParam(value = "Account Id to search") String accountId) {
        return new ResponseEntity<List<Transaction>>(service.getTransactions(customerId,accountId),HttpStatus.OK);
    }

    @ApiOperation(value = "transactions from an account", notes = "This endpoint returns campaigns", response = Campaign.class, responseContainer = "List", tags={ "Campaigns", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The confirmation code.", response = Campaign.class),
        @ApiResponse(code = 204, message = "not content", response = Campaign.class),
        @ApiResponse(code = 400, message = "service not found", response = Campaign.class),
        @ApiResponse(code = 500, message = "Business service ERROR", response = Campaign.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Campaign.class) })
    @RequestMapping(value = "/campaings",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
	@Override
	public ResponseEntity<List<Campaign>> campaignsGet(@RequestHeader String customerId) {
		return new ResponseEntity<List<Campaign>>(service.getCampaings(customerId),HttpStatus.OK);
	}


}
