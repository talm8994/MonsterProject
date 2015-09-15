package monster.controller;

import monster.model.Monster;
import marshmallows.view.monsterDisplay;
import java.util.Scanner;
public class MonsterController
{
	private Monster thomasMonster;
	private monsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "beacky";
		int eyes = 2;
		int noses = 4;
		double legs = 1.1;
		double hair = 1.1;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new monsterDisplay();
		thomasMonster = new Monster(name, eyes, noses, legs, hair, hasBellyButton);
	}
	public void start()
	{
		myDisplay.displayInfo(thomasMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + thomasMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one please!!");
		String newMonsterName = monsterScanner.next();
		thomasMonster.setmonsterName(newMonsterName);
	}
}
