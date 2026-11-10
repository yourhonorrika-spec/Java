package Ch10;
//pg423 fig:10.12
public class Invoice implements Payable{
	private String pn;
	private String pd;
	private int q;
	private double ppi;



	public Invoice(String pn, String pd, int q, double ppi) {
		super();
		this.pn = pn;
		this.pd = pd;
		this.q = q;
		this.ppi = ppi;
	}



	public String getPn() {
		return pn;
	}



	public void setPn(String pn) {
		this.pn = pn;
	}



	public String getPd() {
		return pd;
	}



	public void setPd(String pd) {
		this.pd = pd;
	}



	public int getQ() {
		return q;
	}



	public void setQ(int q) {
		this.q = q;
	}



	public double getPpi() {
		return ppi;
	}



	public void setPpi(double ppi) {
		this.ppi = ppi;
	}




	@Override
	public String toString() {
		return String.format("\ninvoice:\npart number: %s(%s)\nquantity: %d\nprice per item: $%,.2f\n", getPn(), getPd(),getQ(),getPpi());
	}



	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getPpi() * getQ();
	}
	

	
}
