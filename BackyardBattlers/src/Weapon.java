
public class Weapon extends Item {
	//Properties
	public int damage;
	public int durability;
	//Constructor
	public Weapon(String name, String description, int damage, int durability) {
		super(name, description);
		this.damage = damage;
		this.durability = durability;
	}
	
	//Methods
	public void attack() {
		System.out.println("You attacked with your " + name + "!");
	}
}
