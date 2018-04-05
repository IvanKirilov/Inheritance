package OOP;

public class Fox extends Canine{
private String colour;

public Fox(String name, int yearBorn, String habitat, String colour) {
	super(name, yearBorn, habitat);
	this.colour = colour;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
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
	.append(this.getColour());
	return sb.toString();
}
}
