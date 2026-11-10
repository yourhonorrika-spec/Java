package Ch10;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		Payable[] p= new Payable[4];
		p[0] = new Invoice("01234","seat",2,375.00);
		p[1] = new Invoice("56789","tire",4,79.00);
		p[2]= new SalariedEmployee("John","Smith","111-11-1111",800.00);
		p[3]= new SalariedEmployee("Lisa","Barnes","888-88-8888",1200.00);
		System.out.println("Invoices and Employees produced polymorphically:");
		for(Payable pb:p)
			System.out.printf("%spaymentdue: $%,.2f\n",pb.toString(),pb.getPaymentAmount());
	}
}