package Ch9;
//fig 9.7 pg 370
public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee b= new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000,.04, 300);
		System.out.println("Employee information obtained by get methods: \n");
		System.out.printf("%s %s\n", "First name is",b.getFn());
		System.out.printf("%s %s\n","Last name is", b.getLn());
		System.out.printf("%s %s\n","Social security number is", b.getSsn());
		System.out.printf("%s %s\n","Gross sales is", b.getSales());
		System.out.printf("%s %s\n","Commission rate is",b.getRate());
		System.out.printf("%s %s\n","Base salary is", b.getSalary());
		b.setSalary(1000);
		System.out.println("\nUpdated employee information obtained by toString: \n" +b.toString());



	}
	}

