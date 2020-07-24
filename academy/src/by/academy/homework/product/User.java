package by.academy.homework.product;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	private String name;
	private String phone;
	private String email;
	private String dateOfBirth;

	Scanner sc = new Scanner(System.in);

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;

	}

	public User(String name, String phone, String email, String dateOfBirth) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		Pattern p = Pattern.compile("^\\+37529[\\d]{7}$");
		Matcher m = p.matcher(getPhone());
		if (m.find()) {
		} else {
			System.out.println("Phone number is invalid " + "\n" + "Enter phone number again. (Example: +375291234567");
			setPhone(sc.nextLine());
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		Pattern p = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
		Matcher m = p.matcher(getEmail());
		if (m.find()) {
		} else {
			System.out.println("Email is invalid " + "\n" + "Enter Email again. (Example: bob@gmail.com");
			setEmail(sc.nextLine());
		}
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0]?[1-9]|1[0-2])/\\d{4}");
		Pattern p2 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|1[0-2])-\\d{4}"); // b
		Matcher m1 = p1.matcher(getDateOfBirth());
		Matcher m2 = p2.matcher(getDateOfBirth());
		if (m1.find() || m2.find()) {

		} else {
			System.out.println("Date of birth is invalid " + "\n" + "Enter date of birth again. (Example: 11/02/2000");

			setDateOfBirth(sc.nextLine());

		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=").append(name).append(", phone=").append(phone).append(", email=").append(email)
				.append(", dateOfBirth=").append(dateOfBirth).append("]");
		return builder.toString();
	}
  
}
