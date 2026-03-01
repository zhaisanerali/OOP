package lab3;


public class Data {
	private int cnt;
	private double sum;
	private double max;
	
	
	
	public Data() {
		this.cnt = 0;
		this.sum = 0.0;
		this.max = Double.NEGATIVE_INFINITY;
		
	}
	
	public void add(double num) {
		
			if (num > this.max) {
				this.max = num;
			}
			this.sum += num;
			this.cnt += 1;
			
		}
	
	
	public double avg() {
		if (this.cnt == 0) {
			return 0;
		}
		return (double) (this.sum / (double) this.cnt);
	}
	
	
	public double largestData() {
		return this.max;
	}
	
	
	
	public void getInfo() {	
		System.out.println("Average = " + avg());
		System.out.println("Maximum = " + this.max);
	}
	
	
	

}
