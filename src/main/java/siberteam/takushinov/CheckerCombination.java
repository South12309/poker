package siberteam.takushinov;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CheckerCombination {
    private static final int ACE_NUMBER=14;
    public static CombinationAndKiker check(PokerHand pokerHand) {
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
        if (flash && street && sortedListCardValues.get(0)==ACE_NUMBER) {
            return new CombinationAndKiker(Combination.FLASHROYAL, sortedListCardValues);
        }
        if (flash && street) {
            return new CombinationAndKiker(Combination.STREET_FLASH, sortedListCardValues);
        }
        if (street) {
            return new CombinationAndKiker(Combination.STREET, sortedListCardValues);
        }
        if (flash) {
            return new CombinationAndKiker(Combination.FLASH, sortedListCardValues);
        }

        boolean pair=false;
        boolean twoPairs=false;
        boolean set=false;
        boolean kare=false;
        for (Map.Entry<Integer, Integer> entry : analiseValues.entrySet()) {
            if (entry.getValue()==2) {
                if (pair) {
                    twoPairs = true;
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
            return new CombinationAndKiker(Combination.KARE, sortedListCardValues);
        }
        if (twoPairs) {
            return new CombinationAndKiker(Combination.TWO_PAIRS, sortedListCardValues);
        }
        if(pair && set) {
            return new CombinationAndKiker(Combination.FULL_HOUSE, sortedListCardValues);
        }
        if(set) {
            return new CombinationAndKiker(Combination.SET, sortedListCardValues);
        }
        if (pair) {
            return new CombinationAndKiker(Combination.PAIR, sortedListCardValues);
        }
        return new CombinationAndKiker(Combination.HIGH_CARD, sortedListCardValues);
    }
}
