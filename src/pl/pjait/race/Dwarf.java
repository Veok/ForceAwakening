package pl.pjait.race;

import pl.pjait.Ability;

import java.util.ArrayList;
import java.util.List;

public class Dwarf extends Race {
    private final List<Ability> abilities = new ArrayList<>(List.of(Ability.DARK_VISION, Ability.SUPER_STAMINA));

    public Dwarf() {
        super();
    }

    @Override
    public List<Ability> abilities() {
        return abilities;
    }
}
