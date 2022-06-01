package com.qa.jdbc_example.single_entity;

import java.util.Objects;

/**
 * User is a domain object (represents the target business domain), also represents the entity in our database
 * @author Morgan Walsh
 *
 */
public class User {
	
	// CREATE TABLE IF NOT EXISTS user (
	//   id BIGINT UNSIGNED AUTO_INCREMENT,
	//   forename VARCHAR(128) NOT NULL,
	//   surname VARCHAR(128) NOT NULL,
	//   age TINYINT UNSIGNED
	// );

	private long id;
	private String forename;
	private String surname;
	private int age;
	
	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, forename, id, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(forename, other.forename) && id == other.id
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", forename=" + forename + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
}
