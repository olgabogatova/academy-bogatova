package by.academy.homework.homework2.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	 Pattern p = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
	 
	@Override
	public boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}

	
}
