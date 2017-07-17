package br.com.openbank.service.commons.validator;

import org.springframework.stereotype.Component;

import br.com.openbank.commons.constant.EnumError;
import br.com.openbank.commons.exception.BusinessServiceException;

@Component
public class Validator {

	public void checkClientNumber(String clientNumber) throws Exception {
		this.isNull(clientNumber);
		this.isBlank(clientNumber);
	}

	public void checkContractId(String clientNumber) throws Exception {
		this.isNull(clientNumber);
		this.isBlank(clientNumber);
	}
	
	public void check(String cad) throws Exception {
		this.isNull(cad);
		this.isBlank(cad);
	}
	
	public void checkOption(String option) throws Exception {
		this.isNull(option);
		this.isBlank(option);
		if (option.length() > 1) {
			this.throwWrongParameters();
		}
	}

	public void isBlank(String string) throws Exception {
		if (string == null || string.isEmpty()) {
			this.throwWrongParameters();
		}
	}

	public void isNull(Object object) throws Exception {
		if (object == null) {
			this.throwWrongParameters();
		}
	}
	
	public void throwWrongParameters () throws Exception {
		
		throw new BusinessServiceException(EnumError.WRONG_PARAMETERS.name());
	}

}
