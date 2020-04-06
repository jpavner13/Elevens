1) Dealt, in play, discarded, selected
2)  - shuffle dec of cards randomly
    - draw 9 cards from the top and place them face up on the playing table
    - select cards that add up to 11, or three cards that are JQK
    - discard the selected two or three cards
    - replace the empty spots on the table with new cards from the top of the shuffled deck
    - repeat 3-5
3) for the board, yes. For the cards, maybe?
4) When setting up a new game, Probably the replace cards method, {J, 6, 2, A, 4}.
            public static printCards(ElevensBoard board){
                List<Integer> cIndexes = board.cardIndexes();
                for(int num : cIndexes){
                    Sysytem.out.println(num);
                }
            }
    