package br.com.openbank.service.commons.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

/**
 * @author MB65429
 *
 */

@Component
public class FormatDateValidator {

	private static final String DD_MM_YYYYPATERN = "\\d\\d-\\d\\d-\\d\\d\\d\\d";

	private static final String DDMMYYYYPATERN = "\\d\\d/\\d\\d/\\d\\d\\d\\d";

	private static final String YYYY_MM_DDPATERN = "\\d\\d\\d\\d-\\d\\d-\\d\\d";

	private static final String YYYYMMDDPATERN = "\\d\\d\\d\\d/\\d\\d/\\d\\d";

	public boolean matcher(String dateCompare) {
		boolean isFormat = false;
		if (Pattern.matches(DD_MM_YYYYPATERN, dateCompare)
				|| Pattern.matches(DDMMYYYYPATERN, dateCompare)
				|| Pattern.matches(YYYY_MM_DDPATERN, dateCompare)
				|| Pattern.matches(YYYYMMDDPATERN, dateCompare)) {
			isFormat = true;
		}
		return isFormat;
	}
}
