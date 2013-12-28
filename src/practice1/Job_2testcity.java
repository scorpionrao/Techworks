package practice1;

public class Job_2testcity {

	public static void main(String[] args) {
		
		Job_2city c1 = new Job_2city();
		Job_2city c2 = new Job_2city();
		Job_2city c3 = new Job_2city();
		Job_2city c4 = new Job_2city();
		c1.name = "chennai";
		c2.name = "mylapore";
		c3.name = "triplicane";
		c4.name = "t.nagar";
			/*System.out.println(c1.name);
			System.out.println(c2.name);
			System.out.println(c3.name);	
			System.out.println(c4.name);*/
			
		c1=c2;
		
			/*System.out.println(c1.name);
			System.out.println(c2.name);
			System.out.println(c3.name);	
			System.out.println(c4.name);*/
			
		c1.name = "kilpauk";
		
			System.out.println(c1.name);
			System.out.println(c2.name);
			System.out.println(c3.name);	
			System.out.println(c4.name);
		
	}

}
