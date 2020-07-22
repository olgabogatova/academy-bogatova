package by.academy.homework.product;

import java.util.Date;

public class User {

	private String name;
	private String phone;
	private String email;
	private Date dateOfBirth;
	
	
	
	public User() {
		super();
	}
	
	public User(String name) {
		super();
		this.name = name;
		
	}
	

	
	public User(String name, String phone, String email, Date dateOfBirth) {
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
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=").append(name).append(", phone=").append(phone).append(", email=").append(email)
				.append(", dateOfBirth=").append(dateOfBirth).append("]");
		return builder.toString();
	}
	
	
	
}
