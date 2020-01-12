package elements;

public class fruit {

	double value;
	int type; 
	double pop;
	
	public fruit() { ; }

	public fruit (double value, int type, double pop){

		this.value = value;
		this.type = type;
		this.pop = pop;
	}

	public double getValue(){
		return this.value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	public int getType(){
		return this.type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public double getPop(){
		return this.pop;
	}

	public void setPop(double pop) {
		this.pop = pop;
	}
}