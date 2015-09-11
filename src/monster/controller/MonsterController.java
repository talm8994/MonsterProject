package monster.controller;

import monster.model.Monster;
import marshmallows.view.monsterDisplay;
public class MonsterController
{
	private Monster thomasMonster;
	private monsterDisplay myDisplay;
	
	public MonsterController()
	
	{
		String name = "beacky";
		int eyes = 2;
		int noses = 4;
		double legs = 1.1;
		double hair = 1.1;
		boolean hasBellyButton = true;
		
		myDisplay = new monsterDisplay();
		thomasMonster = new Monster(name, eyes, noses, legs, hair, hasBellyButton);
	}
	public void start()
	{
		myDisplay.displayInfo(thomasMonster.toString());
	}
}
