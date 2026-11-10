package Ch10;

public class SalariedEmployee extends Employee{
	private double ws;

	public SalariedEmployee(String fn, String ln, String ssn, double ws) {
		super(fn, ln, ssn);
		this.ws = ws;
	}

	public double getWs() {
		return ws;
	}

	public void setWs(double ws) {
		this.ws = ws;
	}

	@Override
	public String toString() {
		return String.format("\nsalaried employee: %sweekly salary: $%,.2f\n",super.toString(),getWs());
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getWs();
	}
	
	

}
