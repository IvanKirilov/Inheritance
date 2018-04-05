package OOP;

public class Human extends Primate {
private String country;
private String telNum;
public Human(String name, int yearBorn, String habitat, String country, String telNum) {
	super(name, yearBorn, habitat);
	this.setCountry(country);
	this.setTelNum(telNum);
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getTelNum() {
	return telNum;
}
public void setTelNum(String telNum) {
	this.telNum = telNum;
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
	.append(this.getCountry())
	.append(" ")
	.append(this.getTelNum());
	return sb.toString();
}
}
