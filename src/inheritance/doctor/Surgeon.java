package inheritance.doctor;

public class Surgeon extends Doctor {
	@Override
	public void treatPatient() {
		System.out.println("Surgeon Treat Patient");
	}
}
