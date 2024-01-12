package siberteam.takushinov;

import lombok.Getter;

import java.util.List;
@Getter
public class CombinationAndKiker {
    private final Combination combination;
    private final List<Integer> kikerList;

    public CombinationAndKiker(Combination combination, List<Integer> kikerList) {
        this.combination = combination;
        this.kikerList = kikerList;
    }
}
