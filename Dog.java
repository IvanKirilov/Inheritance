package OOP;

public class Dog extends Canine{
	private int puppies;

	public Dog(String name, int yearBorn, String habitat, int puppies) {
		super(name, yearBorn, habitat);
		this.puppies = puppies;
	}

	public int getPuppies() {
		return puppies;
	}

	public void setPuppies(int puppies) {
		this.puppies = puppies;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb
		.append(this.getName())
		.append(" ")
		.append(this.getYearBorn())
		.append(" ")
		.append(this.getHabitat())
		.append(" ")
		.append(this.getPuppies());
		return sb.toString();
	}

}
