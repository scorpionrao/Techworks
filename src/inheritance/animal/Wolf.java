package inheritance.animal;

public class Wolf extends Canine {
	@Override
	void makeNoise() {
		System.out.println("Make Noise like Wolf");
	}
	@Override
	void eat() {
		System.out.println("Eat like Wolf");
	}

}
