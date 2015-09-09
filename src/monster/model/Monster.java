package monster.model;

public class Monster
{
	private String monstername;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	private Monster()
	{
		
	}

	
	public Monster(String monstername, int monstereyes, int monsterEyes, boolean monsteBellyBotton, double monsterlegs, double MonsterHair)
	{
		this.monstername = monstername;	
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton=monsterBellyButton;
	}
	}	