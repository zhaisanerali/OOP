package lab3;

public class Problem3 {

	public static void main(String[] args) {
		
		
		Temperature temperature1 = new Temperature();
		System.out.println(temperature1.getScale());
		System.out.println(temperature1.getTemp());
		
		
		
		Temperature temperature2 = new Temperature(18.5);
		temperature2.getInfo();
		
		
		
		Temperature temperature3 = new Temperature('F');
		temperature3.getInfo();
		temperature3.getDegreesC();
		System.out.print("In C: ");
		temperature3.getInfo();
		
		
		
		Temperature temperature4 = new Temperature(-3.0, 'C');
		temperature4.getInfo();
		temperature4.getDegreesF();
		System.out.print("In F: ");
		temperature3.getInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
