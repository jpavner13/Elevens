/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("king", "Spades", 13);
		Card card2 = new Card("king", "Hearts", 13);
		Card card3 = new Card("Seven", "Dimonds", 7);

		cardTester(card1, card2);
		cardTester(card2, card3);
		cardTester(card3, card1);
	}

	public static void cardTester(Card card, Card card2){
		System.out.println(card.suit());
		System.out.println(card.rank());
		System.out.println(card.pointValue());
		System.out.println(card.matches(card2));
		System.out.println(card.toString());

	}
}
