package inheritance.shape;

public class Amoeba extends Shape {
	@Override
	public void rotate() {
		System.out.println("Amoeba Rotate");
	}
	@Override
	public void playSound() {
		System.out.println("Amoeba Play Sound");
	}

}
