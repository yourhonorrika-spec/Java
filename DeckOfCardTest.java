package Ch7;

public class DeckOfCardTest {

    public static void main(String[] args) {
    	DeckOfCards d=new DeckOfCards();
    	d.shuffle();
    	
    	for(int i=1; i<=52;i++) {
    		System.out.printf("%-19s",d.dealCard());
    		if(i%4==0)
    			System.out.println();
    	}
    	
    	
}
}