package inheritance.animal;

public class Hippo extends Animal {
	@Override
	void makeNoise() {
		System.out.println("Make Noise like Hippo");
	}
	@Override
	void eat() {
		System.out.println("Eat like Hippo");
	}
}
