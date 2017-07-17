package br.com.openbank.commons.constant;

public enum EnumError {

	MANDATORY_PARAMETERES_MISSING("mandatoryParametersMissing"),

	EXPAND_ERROR("expandError"),

	PARAMETER_MISSING("parametersMissing"),

	WRONG_PARAMETERS("wrongParameters");
	
	
	private String alias;

	EnumError(final String alias) {
		this.alias = alias;
	}

	public String getAlias() {
		return this.alias;
	}

	/**
	 * Obtiene el enum a partir del alias del error.
	 * 
	 * @param alias
	 *            Alias del error.
	 * @return
	 */
	public static EnumError fromAlias(final String alias) {
		for (final EnumError error : values()) {
			if (error.alias.equals(alias)) {
				return error;
			}
		}
		return null;
	}

}
