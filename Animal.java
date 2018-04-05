package OOP;

public abstract class Animal {
	private String name;
	private int yearBorn;
	public Animal(String name, int yearBorn) {
		this.setName(name);
		this.setYearBorn(yearBorn);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearBorn() {
		return yearBorn;
	}
	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}
	

}
