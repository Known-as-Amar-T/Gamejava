package Gamepack;



 class Player1 
{
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name,String weapon,int health)
	{
		this.name=name;
		this.weapon=weapon;
		
		if(health<0  || health >100)
		{
			this.health=100;
			
		}
		else this.health=health;
	}
	public void damageByGun1()
	{
		this.health-=30;
		if(this.health<=0)
		{
			this.health=0;
			
		}
		System.out.println("Got hit by gun 1.Health is reducted by 30"+".New health is"+this.health);
		
		if(this.health==0)
		{
			System.out.println(getName()+" is dead");
		}
		
		
	}

	public void damageByGun2()
	{
		this.health-=50;
		if(this.health<=0)
		{
			this.health=0;
			
		}
		System.out.println("Got hit by gun 1.Health is reducted by 50"+".New health is"+this.health);
		
		if(this.health==0)
		{
			System.out.println(getName()+" is dead");
		}
	}
	public void heal()
	{
		if(this.health<=0)System.out.print("Player are dead.Heal not possible");
		else 
			{
			this.health=100;
			System.out.print("Health is"+this.health);
			}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

}

 class Player2 extends Player1
{
	private int health;
	private boolean armour;
	public Player2(String name,String weapon ,int health,boolean armour)
	{
		super(name,weapon,health);
		this.health=health;
		this.armour=armour;
	}
	@Override
	public void damageByGun1() {
	if(armour)
	{
		this.health-=30;
		if(this.health<=0)this.health=0;
		System.out.println("Armour is on.Got hit by gun 1.Health is reduced by 20."+"New health is"+this.health);
	}
	if(!armour)
	{
		this.health-=40;
		if(this.health<=0)this.health=0;
		System.out.println("Armour is off.Got hit by gun 1.Health is reduced by 40."+"New health is"+this.health);
	
	}
	if (this.health==0)
	{
		System.out.println(getName()+"is dead");
	}
	}
	@Override
	public void damageByGun2()
	{
		if(armour)
		{
			this.health-=40;
			if(this.health<=0)this.health=0;
			System.out.println("Armour is on.Got hit by gun 1.Health is reduced by 40."+"New health is"+this.health);
		}
		if(!armour)
		{
			this.health-=50;
			if(this.health<=0)this.health=0;
			System.out.println("Armour is off.Got hit by gun 1.Health is reduced by 50."+"New health is"+this.health);
		
		}
		if (this.health==0)
		{
			System.out.println(getName()+"is dead");
		}
		

	}
	@Override
	public void heal() {
		// TODO Auto-generated method stub
		super.heal();
	}
	
	
	
}

 public class Game
 {
	 public static void main(String args[])
	 {
		 
		Player1 p1=new Player1("Abay","sword",-20);
		//System.out.println(p1.getName());
		//System.out.println(p1.getHealth());
		//System.out.println(p1.getWeapon());
		
		p1.damageByGun1();
		p1.damageByGun1();
		p1.damageByGun2();
		p1.heal();
		
		//Player2 b = new Player2("Sam","machine gun",80,false);
		//b.damageByGun1();
	 
	 
	 }
	 
 }

