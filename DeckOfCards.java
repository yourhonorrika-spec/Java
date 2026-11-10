package Ch7;

import java.util.Random;

//fig: 7.10 pg.255

public class DeckOfCards {
	private Card[] deck;
	private Random random= new Random();
	private int current;
	private final int NOCARD = 52;
	
	public DeckOfCards() {
		String[] faces = {"Six","Queen","Three","Four","King","Ace","Deuce","Jack","Five","Eight","Seven","Ten","Nine"};
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};

		deck= new Card[NOCARD];
		for(int i=0; i< NOCARD;i++) {
			deck[i]  = new Card(faces[i%13],suits[i/13]);
		}
		
		
		
		
	}
	public void shuffle() { 
		for(int first = 0; first <NOCARD;first++) {
			int second = random.nextInt(NOCARD);
			Card temp= deck[first];
			deck[first] = deck[second];
			deck[second]  = temp;
		}
	}
	
	public Card dealCard() {
		if( current< NOCARD) {
			return deck[current++];
		}else
			return null;
	}

	}
	
	
	
	
   
