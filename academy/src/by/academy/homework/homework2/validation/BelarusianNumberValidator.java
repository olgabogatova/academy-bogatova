package by.academy.homework.homework2.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusianNumberValidator implements Validator {

	Pattern p = Pattern.compile("^\\+37529[\\d]{7}$");

	@Override
	public boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}

}
