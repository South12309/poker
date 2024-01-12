package siberteam.takushinov;

import org.junit.Assert;
import org.junit.Test;
import siberteam.takushinov.combination.Combination;
import siberteam.takushinov.combination.CombinationAndKiker;

public class CheckerCombinationTest {
    @Test
    public void checkFlashRoyal() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KS AS JS"));
        Assert.assertEquals(Combination.FLASHROYAL, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkStreetFlash() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KS 9S JS"));
        Assert.assertEquals(Combination.STREET_FLASH, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkKare() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QD QS QC QH"));
        Assert.assertEquals(Combination.KARE, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkFullHouse() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QD QS QC KH"));
        Assert.assertEquals(Combination.FULL_HOUSE, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkFlash() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QS QS QS KS"));
        Assert.assertEquals(Combination.FLASH, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkStreet() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KH 9S JD"));
        Assert.assertEquals(Combination.STREET, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkSet() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS TH 9S TD"));
        Assert.assertEquals(Combination.SET, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkTwoPairs() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS TH 9S 9D"));
        Assert.assertEquals(Combination.TWO_PAIRS, tsQsKsAsJs.getCombination());
    }
    @Test
    public void checkPair() {
        CombinationAndKiker tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS TH 9S 8D"));
        Assert.assertEquals(Combination.PAIR, tsQsKsAsJs.getCombination());
    }
}