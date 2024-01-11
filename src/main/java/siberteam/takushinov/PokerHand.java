package siberteam.takushinov;

import java.util.ArrayList;
import java.util.List;

public class PokerHand implements Comparable<PokerHand>{
    private final List<Card> cards = new ArrayList<>(5);
   // private final CheckerCombination checkerCombination;

    public PokerHand(String handString) {
        String[] handArray = handString.split(" ");
        for (String s : handArray) {
            cards.add(new Card(s));
        }
    }

    @Override
    public int compareTo(PokerHand o) {
        return 0;
    }
}
