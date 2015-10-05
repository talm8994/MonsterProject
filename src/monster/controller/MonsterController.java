package monster.controller;

import input.view.PopupDisplay;
import monster.model.Monster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private Monster thomasMonster; // Declares a Monster called thomasMonster.
	private Monster userMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	private PopupDisplay myPopups;
	public MonsterController()
	{
		String name = "beacky";
		int eyes = 2;
		int noses = 4;
		double legs = 1.1;
		double hair = 1.1;
		boolean hasBellyButton = true;

		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		thomasMonster = new Monster(name, eyes, noses, legs, hair, hasBellyButton);
		myPopups = new PopupDisplay();
	}

	public void start()
	{
		myDisplay.getAnswer(thomasMonster.toString());
		this.popupMonster();
		myDisplay.displayResponse("Updated monster info: " + userMonster.toString());
	}

	
	private void popupMonster()
	{
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.displayResponse("you did not tipe valid number.");
		}
		return isDouble;
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one please!!");
		String newMonsterName = monsterScanner.next();
		thomasMonster.setmonsterName(newMonsterName);

		System.out.println("Number of eyes");
		int updateEyes = monsterScanner.nextInt();
		thomasMonster.setMonsterEyes(updateEyes);

		System.out.println("number of noses");
		int updateNoses = monsterScanner.nextInt();
		thomasMonster.setmonsterNoses(updateNoses);

		System.out.println("Give legs");
		double updateLegs = monsterScanner.nextDouble();
		thomasMonster.setmonsterLegs(updateLegs);

		System.out.println("Give hair");
		Double updateHair = monsterScanner.nextDouble();
		thomasMonster.setmonsterLegs(updateHair);

		System.out.println("belly botton?");
		Boolean updateBellyButton = monsterScanner.nextBoolean();
		thomasMonster.setmonsterBellyButton(updateBellyButton);
	}

	/**
	 * Creates a Monster instance from user input.
	 */
	private void createUserMonster()
	{
		// Step one: Gather user information
		System.out.println("Whats your monsters name?");
		String userName;
		userName = monsterScanner.nextLine();

		System.out.println("How Many legs do i have?");
		double userLegs = monsterScanner.nextDouble();

		System.out.println("How much hair, another decimal value");
		double userHair;
		userHair = monsterScanner.nextDouble();

		System.out.println("does it have a belly button - true or false");
		boolean hasBellyButton = monsterScanner.nextBoolean();
		System.out.println("number of eyes on the monster");
		int userEyes = monsterScanner.nextInt();
		System.out.println("how many noses");
		int userNoses = monsterScanner.nextInt();

		// Step two: Build the monster using the constructor.
		userMonster = new Monster(userName, userEyes, userNoses, userLegs, userHair, hasBellyButton);
	}
}
