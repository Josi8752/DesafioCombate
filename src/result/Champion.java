package result;

public class Champion {

	private  String name;
	private int life;
	private int atack;
	private int armor;
	
	public Champion(String name, int life, int atack, int armor) {
		
		this.name = name;
		this.life = life;
		this.atack = atack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	
	public int getAtack() {
		return atack;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void takeDamage(Champion other) {
	this.life += this.armor - this.atack; 
	}
	
	public String status() {
		while (life > 0) {
			
			System.out.println(name+ ":"+ life+" de vida");
			System.out.println(name+ ":"+ life+" de vida");
		}
		if(life <= 0) {
			
			System.out.println(name+ life+": de vida(morreu)");
			System.out.println(name+ ":"+ life+" de vida");
			
		}
		else {
			System.out.println(name+ ":"+ life+" de vida");
			System.out.println(name+ ":"+ life+" de vida");
			
		}
		return  "FIM DO COMATE";
	}
	
	public String toString() {
		return name
		+": "
		+life
		+ " de vida";
	}
}