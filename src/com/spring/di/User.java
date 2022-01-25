package com.spring.di;

public class User implements UserInterface {
	private PersonInterface person;
	private String email;
	private String team;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	/*
	public User(PersonInterface person) {
		this.person = person;
	}
	*/
	@Override
	public void start() {
		System.out.println("I am user ");

	}
	public void setPerson(PersonInterface person) {
		this.person = person;
	}
	@Override
	public void getPerson() {
		this.person.begin();
	}
	public void doStart() {
		System.out.println("Start ...");
	}
	public void doEnd() {
		System.out.println("END");
	}

}
