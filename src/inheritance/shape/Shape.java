package inheritance.shape;

public class Shape {
	public String string = "String";
	public void rotate() {
		System.out.println("Rotate");
	}
	public void playSound() {
		System.out.println("Play Sound");
	}
	
	public static void main(String[] args) {
		Shape shape1 = new Shape();
		shape1.rotate();
		Shape shape2 = new Square();
		shape2.rotate();
		Shape shape3 = new Triangle();
		shape3.rotate();
		Shape shape4 = new Circle();
		shape4.rotate();
		Shape shape5 = new Amoeba();
		shape5.rotate();
	}

}
