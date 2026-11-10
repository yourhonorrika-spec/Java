package Ch9;
//fig 9.7 pg 370
public class BasePlusCommissionEmployee {

	private String fn;
	private String ln;
	private String ssn;
	private double sales;
	private double rate;
	private double salary;
	public BasePlusCommissionEmployee(String fn, String ln, String ssn, double sales, double rate, double salary) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.ssn = ssn;
		this.sales = sales;
		this.rate = rate;
		this.salary = salary;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		if(sales > 0.0)
		this.sales = sales;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		if(rate > 0.0 && rate < 1.0)
		this.rate = rate;
		else
			throw new IllegalArgumentException("rate must be > 0.0 and < 1.0");
	}
	private Exception IllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary >= 0.0)
		this.salary = salary;
	}
	public double earning() {
		return salary + (rate * sales);
	}
	@Override
	public String toString() {
		return "\nbase-salaried commission employee: " + fn + " " + ln +"\nsocial security number: " + ssn + "\ngross sales: " + sales + "\ncommission rate: " + rate + "\nbase salary: " + salary;
	}
	
	
	
 
}
