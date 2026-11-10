package Ch10;

public abstract  class Employee implements Payable{
	private String fn;
	private String ln;
	private String ssn;

	public Employee(String fn, String ln, String ssn) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.ssn = ssn;
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

	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s\n",getFn(),getLn(), getSsn());
		
	}
	
	 
	


}
