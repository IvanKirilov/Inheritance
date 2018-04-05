package OOP;

public class Snake extends Reptile {
	private int length;

	public Snake(String name, int yearBorn, int waterPerWeek, int length) {
		super(name, yearBorn, waterPerWeek);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb
		.append("Snake's name ")
		.append(this.getName())
		.append(" ")
		.append("Year of birth ")
		.append(this.getYearBorn())
		.append(" ")
		.append("Need water per week ")
		.append(" ")
		.append(this.getWaterPerWeek())
		.append(" ")
		.append("Snake's length ")
		.append(" ")
		.append(this.getLength());
		return sb.toString();
	}

}
