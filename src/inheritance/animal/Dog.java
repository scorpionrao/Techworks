package inheritance.animal;

public class Dog extends Canine {
	@Override
	void makeNoise() {
		System.out.println("Make Noise like Dog");
	}
	@Override
	void eat() {
		System.out.println("Eat like Dog");
	}
}
