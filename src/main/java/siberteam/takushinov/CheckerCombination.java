package siberteam.takushinov;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CheckerCombination {
    public static Combination check(PokerHand pokerHand) {
        HashMap<Integer, Integer> analiseValues = new HashMap<>();
        HashSet<String> suits = new HashSet<>();
        boolean flash = false;
        boolean street = false;
        for (Card card : pokerHand.getCards()) {
            int number = card.getValue().getNumber();
            analiseValues.put(number, analiseValues.getOrDefault(number, 0) + 1);
            suits.add(card.getSuit().name());
        }
        if (suits.size()==1) {
            flash = true;
        }
        List<Integer> sortedListCardValues = analiseValues.keySet().stream().sorted(Comparator.reverseOrder()).toList();
        if (analiseValues.size() == 5) {
            street = true;
            for (int i = 1; i < sortedListCardValues.size(); i++) {
                if (Math.abs(sortedListCardValues.get(i) - sortedListCardValues.get(i-1))!=1) {
                    street = false;
                    break;
                }
            }
        }
        if (flash && street && sortedListCardValues.get(0)==14) {
            return Combination.FLASHROYAL;
        }
        if (flash && street) {
            return Combination.STREET_FLASH;
        }
        if (street) {
            return Combination.STREET;
        }
        if (flash) {
            return Combination.FLASH;
        }

        boolean pair=false;
        boolean towPair=false;
        boolean set=false;
        boolean kare=false;
        for (Map.Entry<Integer, Integer> entry : analiseValues.entrySet()) {
            if (entry.getValue()==2) {
                if (pair) {
                    towPair = true;
                } else {
                    pair=true;
                }
            }
            if (entry.getValue()==3) {
                set=true;
            }
            if (entry.getValue()==4) {
                kare=true;
            }
        }
        if (kare) {
            return Combination.KARE;
        }
        if (towPair) {
            return Combination.TOW_PAIRS;
        }
        if(pair && set) {
            return Combination.FULL_HOUSE;
        }
        if(set) {
            return Combination.SET;
        }
        if (pair) {
            return Combination.PAIR;
        }
        return Combination.HIGH_CARD;
    }
}
