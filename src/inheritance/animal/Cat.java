package inheritance.animal;

public class Cat extends Feline {
	@Override
	void makeNoise() {
		System.out.println("Make Noise like Cat");
	}
	@Override
	void eat() {
		System.out.println("Eat like Cat");
	}
}
