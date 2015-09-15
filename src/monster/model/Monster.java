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

	
	public Monster(String monstername, int monsterEyes, int monsterNoses , double monsterLegs, double MonsterHair, boolean BellyButton)
	{
	}
	
	public String getMonsterName()
	{
		return monstername;
	}
		public int getMonsterEyes()
		{
			return monsterEyes;
		}
		public void setmonsterName(String monsterName) 
		{
			this.monstername= monsterName;
		}
		public double getmonsterLegs(String monsterLegs)
		{
			return 0;
		}
		public void setMonasterEyes(int monsterEyes)
		{
			this.monsterEyes = monsterEyes;
		}
	public int setMonsterNoses()
	{
		return monsterNoses;
	}
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
		String monsterInfo = " My monster has " + monsterLegs + " Legs and its' name is " + monstername + " My monster has " + monsterEyes + " My monster has " + monsterNoses + " My monster has " + monsterHair + " My monster has" + monsterBellyButton;
		
		return monsterInfo;
	}
	}	