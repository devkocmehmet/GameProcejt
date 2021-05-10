package Entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityIdentity;
	private LocalDate birthDay;
	private String phoneNumber;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String nationalityIdentity, LocalDate birthDay,
			String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;
		this.birthDay = birthDay;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityIdentity() {
		return nationalityIdentity;
	}
	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
