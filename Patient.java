package Hw03;

public class Patient{
	public int idNum;
	public double cafMg;
	
	public Patient(int idNum, double cafMg) {
		this.idNum = idNum;
		this.cafMg = cafMg;
	}
	
	public double getCafMg() {
		return cafMg;
	}
	
	public void setCafMg(double cafMg){
		this.cafMg = cafMg;
	}
	
}
