package by.academy.homework.homework2.validation;

public class Task4Main {

	public static void main ( String [ ]args) {
		
	
	Validator emailValidator = new EmailValidator();
	Validator americanNumberValidator = new AmericanNumberValidator();
	Validator belarusianNumberValidator = new BelarusianNumberValidator();
	System.out.println(emailValidator.validate("academy@acmy.by"));
	System.out.println(americanNumberValidator.validate("+154782165489"));
	System.out.println(belarusianNumberValidator.validate("+375298216548"));
	
	}
}
