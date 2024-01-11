package siberteam.takushinov;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerCombinationTest {
    @Test
    public void checkFlashRoyal() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KS AS JS"));
        Assert.assertEquals(Combination.FLASHROYAL, tsQsKsAsJs);
    }
    @Test
    public void checkStreetFlash() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("TS QS KS 9S JS"));
        Assert.assertEquals(Combination.STREET_FLASH, tsQsKsAsJs);
    }
    @Test
    public void checkKare() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QD QS QC QH"));
        Assert.assertEquals(Combination.KARE, tsQsKsAsJs);
    }
    @Test
    public void checkFullHouse() {
        Combination tsQsKsAsJs = CheckerCombination.check(new PokerHand("KS QD QS QC KH"));
        Assert.assertEquals(Combination.FULL_HOUSE, tsQsKsAsJs);
    }
}