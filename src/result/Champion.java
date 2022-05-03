package result;

public class Champion {

	private  String name;
	private int life;
	private int atack;
	private int armor;
	
	public Champion(String name, int life, int atack, int armor) {
		super();
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
	
	public void takeDamage(Champion other ) {
		(life + armor) - atack;
	}
	public String status() {
		if ( takeDamage <= 0) {
			return name
					+": "
					+ takeDamage
					+ " de vida (morreu)"
					+"FIM DO COMATE";
		}
		
	}
	
}