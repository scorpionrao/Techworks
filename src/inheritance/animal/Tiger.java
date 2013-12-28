package inheritance.animal;

public class Tiger extends Feline {
	@Override
	void makeNoise() {
		System.out.println("Make Noise like Tiger");
	}
	@Override
	void eat() {
		System.out.println("Eat like Tiger");
	}
}
