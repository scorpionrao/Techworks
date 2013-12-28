package inheritance.animal;

public class Lion extends Feline {
	@Override
	void makeNoise() {
		System.out.println("Make Noise like Lion");
	}
	@Override
	void eat() {
		System.out.println("Eat like Lion");
	}
}
