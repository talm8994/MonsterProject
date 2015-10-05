package monster.model;

public class Monster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	private Monster()
	{
		
	}

	
	public Monster(String monsterName, int monsterEyes, int monsterNoses , double monsterLegs, double monsterHair, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;	
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
	}
	//getters
	public String getMonsterName()
	{
		return monsterName;
	}
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	public double getmonsterLegs()
	{
		return monsterLegs;
	}
	public double getmonsterHair()
	{
		return monsterHair;
	}
	public boolean getmonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	//setters
	public void setmonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	public void setMonsterEyes(int newMonsterEyes)
	{
		this.monsterEyes = newMonsterEyes;
	}
	public void setmonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	public void setmonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	public void setmonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	public void setmonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public String toString()
	{
		String monsterInfo = " My monster has " + monsterLegs + " Legs and its' name is " + monsterName + " My monster has Eyes " + monsterEyes + " My monster has Noses " + monsterNoses + " My monster has Hair " + monsterHair + " My monster has Belly Butoon" + monsterBellyButton;
		
		return monsterInfo;
	}
	}	