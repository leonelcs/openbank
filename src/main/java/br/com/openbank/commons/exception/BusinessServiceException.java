package br.com.openbank.commons.exception;

/**
 * Tipo de exce��o particular para os erros pr�prios do componente de execu��o de transa��es.
 *
 * @author Adesis
 *
 */
public class BusinessServiceException extends Exception {

	private static final long serialVersionUID = 4539779395474270321L;

	/**
	 *
	 * @param message
	 */
	public BusinessServiceException(final String message) {
		super(message);
	}

	/**
	 *
	 * @param cause
	 */
	public BusinessServiceException(final Throwable cause) {
		super(cause);
	}

	/**
	 *
	 * @param message
	 * @param cause
	 */
	public BusinessServiceException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
