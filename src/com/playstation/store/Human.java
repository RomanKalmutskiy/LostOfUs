package com.playstation.store;

public class Human {
	private String name;
	private int weight = 10;
	
	public Human(String name) {
		this.name=name;
		toString();
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", weight=" + weight + "]";
	}

}
