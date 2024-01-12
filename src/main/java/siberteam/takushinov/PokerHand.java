package siberteam.takushinov;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class PokerHand implements Comparable<PokerHand>{
    private final List<Card> cards = new ArrayList<>(5);
    private final CombinationAndKiker combinationAndKiker;

    public PokerHand(String handString) {
        String[] handArray = handString.split(" ");
        for (String s : handArray) {
            cards.add(new Card(s));
        }
        combinationAndKiker = CheckerCombination.check(this);
    }
    @Override
    public int compareTo(PokerHand o) {
        int ordinalThis = combinationAndKiker.getCombination().ordinal();
        int ordinalThat = o.getCombinationAndKiker().getCombination().ordinal();
        if (ordinalThis > ordinalThat) {
            return 1;
        } else if (ordinalThis< ordinalThat) {
            return -1;
        }
        List<Integer> kikerListThis = combinationAndKiker.getKikerList();
        List<Integer> kikerListThat = o.getCombinationAndKiker().getKikerList();
        for (int i = 0; i < kikerListThat.size(); i++) {
            if (kikerListThis.get(i)>kikerListThat.get(i)) {
                return 1;
            } else if (kikerListThis.get(i) < kikerListThat.get(i)) {
                return -1;
            }
        }
        return 0;
    }
}
