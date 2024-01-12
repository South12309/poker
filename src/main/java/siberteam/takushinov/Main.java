package siberteam.takushinov;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<PokerHand> hands = new ArrayList<PokerHand>();
        hands.add(new PokerHand("TS QS KS 9S JS"));
        hands.add(new PokerHand("TS QS KH 9S JD"));
        hands.add(new PokerHand("TS QS KS AS JS"));
        hands.add(new PokerHand("TS QS TH 9S 9D"));
        hands.add(new PokerHand("TS QS TH 9S TD"));
        hands.add(new PokerHand("KS QD QS QC KH"));
        hands.add(new PokerHand("TS QS TH 9S 8D"));
        hands.add(new PokerHand("KS QD QS QC QH"));
        hands.add(new PokerHand("KS QS QS QS KS"));
        //System.out.println(CheckerCombination.check(new PokerHand("TS QS KS AS JS")));
        Collections.sort(hands);
        for (PokerHand hand : hands) {
            for (Card card : hand.getCards()) {
                System.out.print(card.getValue().getCardValue()+card.getSuit().name() + " ");
            }
            System.out.println();
        }

    }
}