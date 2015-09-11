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

	
	public Monster(String monstername, int monstereyes, int monsternoses , double monsterlegs, double MonsterHair, boolean BellyButton)
	{
		this.monstername = monstername;	
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton=monsterBellyButton;
	}
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + "Legs and its' name is " + monstername;
		
		return monsterInfo;
	}
	}	