package basics;

class Pen {
	String color;
    String type;
	public void printColor() {
		System.out.println("The color of this Pen is : " + this.color+"\nThe color of this Pen is : "+this.type);
	}
}

public class OOPS {
	public static void main(String args[])
	{
		Pen p1 = new Pen();
		p1.color = "Pink";
		p1.type = "Ballpoint";
		
		Pen p2 = new Pen();
		p2.color = "Blue";
		p2.type = "Gel";
		
		p1.printColor();
		p2.printColor();
		
	}
}