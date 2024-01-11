package siberteam.takushinov;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList<PokerHand> hands = new ArrayList<PokerHand>();
//        hands.add(new PokerHand("KS 2H 5C JD TD"));
//        hands.add(new PokerHand("2C 3C AC 4C 5C"));
        System.out.println(CheckerCombination.check(new PokerHand("TS QS KS AS JS")));
       // Collections.sort(hands);
    }
}