package pl.pjait.race;

import pl.pjait.Ability;

import java.util.ArrayList;
import java.util.List;

public class Human extends Race {
    private final List<Ability> abilities = new ArrayList<>();

    public Human() {
        super();
    }

    @Override
    public List<Ability> abilities() {
        return abilities;
    }
}
