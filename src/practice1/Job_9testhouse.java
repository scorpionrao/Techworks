package practice1;

public class Job_9testhouse {

	public static void main(String[] args) {
//creating object of house class
		Job_8house h1 = new Job_8house ();
		Job_8house h2 = new Job_8house ();
		Job_8house h3 = new Job_8house ();
		Job_8house h4 = new Job_8house ();
			
			h1.housenumber = 123;
			h1.type = " single home";
			h1.buyhouse(10000);
			h2.housenumber = 345;
			h2.type = " multi family home";
			h2.buyhouse(8888888);
			h3.housenumber = 678;
			h3.type = " town homes";
			h4.housenumber = 901;
			h4.type = " apartments";
			
			//h1 = h2;
			//h1.housenumber = 500;
			
			Job_8house.country = " usa";
			Job_8house.PayTax ();
			int cost = 333333;
			System.out.println(h1.housenumber + h1.type + Job_8house.country);
			System.out.println(h2.housenumber + h2.type);
			System.out.println(h3.housenumber + h3.type);
			System.out.println(h4.housenumber + h4.type);
			System.out.println("buying house " + cost);
			System.out.println("buying house " + cost);
			System.out.println("PayingTax "+ 30000);
			
		
	}

}
