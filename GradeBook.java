package Ch7;
//pg272
public class GradeBook {
	private String cn;
	private int[][] g;
	
	
	public GradeBook(String cn, int[][] g) {
		super();
		this.cn = cn;
		this.g = g;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public int[][] getG() {
		return g;
	}
	public void setG(int[][] g) {
		this.g = g;
	}
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n\n",getCn());
		
	}
	public void processArray() {

		outGrades();
		System.out.printf("\n\nLoweset grade in the grade book is %d",getMinimum());
		System.out.printf("\nHighest grade in the grade book is %d\n",getMaximum());
		
		outputBarChart();
	}
	
	private Object getMaximum() {
		int h= g[0][0];		
		for(int[] studentGrade: g) {
			for(int grade: studentGrade) {
				if(grade > h)
					h= grade;
			}
		}
		return h;
	}
	private Object getMinimum() {
		int lg= g[0][0];		
		for(int[] studentGrade: g) {
			for(int grade: studentGrade) {
				if(grade< lg)
					lg= grade;
			}
		}
		return lg;		
	}
	private void outputBarChart() {

		System.out.println("Overall distribution:");
		int[] f= new int[11];
		for(int[] studentGrade: g) {
			for(int grade: studentGrade) {
				++f[grade/10];
			}
		}
		for(int i=0;i<f.length;i++) {
			if(i == 10)
				System.out.printf("%5d: ",100);
			else
				System.out.printf("%2d-%2d: ",i*10,i*10 +9 );
		
		for(int s = 0; s< f[i];s++) {
			System.out.print("*");
		}	System.out.println();
		}
		
	}
	private void outGrades() {

		System.out.println("The grades are: ");
		System.out.print("            ");
		for(int t= 0; t<g[0].length;t++) {
			System.out.printf("Test%d  ", t+1);
		}System.out.println("Average");
	
		for(int student= 0; student< g.length;student++) {
			System.out.printf("\nStudent %2d", student+1);
			
			for(int grade: g[student]) {
				System.out.printf("%8d",grade);
				
			}double avg = getAverage(g[student]);
		}
	}
	private double getAverage(int[] is) {
		 int total = 0; 
		  for (int g: is) 
			total += g;
			
		return (double)total/ is.length;
	}
	
	
		
	}

	
	
	

	

	  