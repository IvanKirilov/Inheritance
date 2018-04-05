package OOP;

public class Chimp extends Primate {
private String foodType;

public Chimp(String name, int yearBorn, String habitat, String foodType) {
	super(name, yearBorn, habitat);
	this.foodType = foodType;
}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
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
	.append(this.getFoodType());
	return sb.toString();
}
}
