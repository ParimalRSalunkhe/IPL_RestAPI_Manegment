package com.root.model;

public class Player {
	private int playerId;
	private String name;
	private int age;
	private String teamName;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String name, int age, String teamName) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.age = age;
		this.teamName = teamName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", age=" + age + ", teamName=" + teamName + "]";
	}
	

}
