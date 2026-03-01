package lab3;

public class Temperature {
	private double temp;
	private char scale;
	
	
	
	public Temperature() {
		this.temp = 0.0;
		this.scale = 'C';
	}
	
	
	
	public Temperature (double value) {
		this.temp = value;
		this.scale = 'C';
	}
	
	
	public Temperature(char scale) {
		this.temp = 0.0;
		this.scale = scale;
	}
	
	
	public Temperature(double value, char scale) {
		this.temp = value;
		this.scale = scale;
	}
	
	
	
	public double getDegreesC() {
		if (this.scale == 'C') {
			return this.temp;
			
		}else {
			return 5 * (this.temp - 32) / 9;
		}
	}
	
	
	
	
	public double getDegreesF() {
		if (this.scale == 'F') {
			return this.temp;
			
		}else {
			return (9 * (this.temp / 5)) + 32;
		}
	}
	
	
	
	public char getScale() {
		return this.scale;
	}
	
	public double getTemp() {
		return this.temp;
	}
	
	
	public void getInfo() {
		System.out.println("Temperature : " + this.getTemp() + " " + this.getScale());
		
	}
	
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public void setScale(char scale) {
        this.scale = scale;
    }
	
	public void setTemperature(double temp, char scale) {
        this.temp = temp;
        this.scale = scale;
    }

}
