/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
		String[] suits = {"hearts", "dimonds", "clubs", "spades"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck deck1 = new Deck(ranks, suits, pointValues);

		testDeck(deck1);

	}

	public static void testDeck(Deck deck){
		System.out.println(deck.size());
		System.out.println(deck.deal().toString());
	}
}
