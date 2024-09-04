package inheritance;

public class Trouser extends Clothing {
	
	private char color;

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}
	
	public void display() {
		super.display();
		System.out.println("color = " + color);
	}
	
}
