package OOP;

public class Mammal extends Animal {
	private String habitat;

	public Mammal(String name, int yearBorn, String habitat) {
		super(name, yearBorn);
		this.setHabitat(habitat);
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

}
