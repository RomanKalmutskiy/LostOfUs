package com.playstation.store;

public class Zombie {

	
public Zombie(Human human) {
	eatHuman (human);
}


public void eatHuman (Human human){
	System.out.println("Zombie eat "+human.toString());
} 

}
