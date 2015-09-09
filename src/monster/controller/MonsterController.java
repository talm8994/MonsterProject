package monster.controller;

import monster.model.Monster;
public class MonsterController
{
	private Monster thomasMonster;
	
	public MonsterController()
	
	{
		String name = "";
		int eyes = 2;
		int noses = 0;
		double legs = 1.1;
		double hair = 1.1;
		boolean hasBellyButton = false;
		
		thomasMonster = new Monster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	public void start();
}
