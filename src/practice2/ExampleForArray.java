package practice2;

public class ExampleForArray {

	public static void main(String[] args) {
// Efficient way of storing a bunch of uniform or homogeneous data are called arrays.
// Arrays always start with zero.	
		
		int[] i = {10, 20, 30, 40, 50};
			System.out.println(i[2] + " " + i[4]);
			
// To Loop through numbers - can use if or enhanced for statement.
			
		for(int temp : i){
			System.out.println(temp);
			
		}
		
// Can always declare a array and assign numbers to it.
		System.out.println("************************");
		
		int[] a = new int[10];
		
// if int array value are not specified by default it will consider zero.
		
		a[0] = 2; a[1] = 4; a[2] = 6;
			for(int temp1 : a){
				System.out.println(a[1] + " " + a[0]);
				System.out.println(temp1);
			}
		
		String[] p = {"apple", "grapes", "watermelon"};
		for(String temp2 : p){
			System.out.println(temp2);
		}
		System.out.println("************************");
		
 /*big diff bet declaring int array and string array is 
string array by default considers null if value is not mentioned.*/	
		
		String[] q = new String[5];
			q[1] = "500";
			q[0] = "600";
			System.out.println(q[0] + " " + q[1]);
			System.out.println("************************");
			for(String temp3 : q){
				System.out.println(temp3);
			}
		
	}

}
