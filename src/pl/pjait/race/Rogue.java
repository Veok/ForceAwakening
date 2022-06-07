package pl.pjait.race;

import pl.pjait.Ability;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Race {
    private final List<Ability> abilities = new ArrayList<>(List.of(Ability.FLYING, Ability.INJURY_PRONE));

    public Rogue() {
        super();
    }

    @Override
    public List<Ability> abilities() {
        return abilities;
    }
}
