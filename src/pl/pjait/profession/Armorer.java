package pl.pjait.profession;

import pl.pjait.Ability;
import pl.pjait.race.Race;

import java.util.List;

public class Armorer extends ProfessionDecorator {
    private final Race race;

    public Armorer(Race race) {
        this.race = race;
        race.abilities().add(Ability.INVENTORY_REPAIRING);
    }

    @Override
    public List<Ability> abilities() {
        return race.abilities();
    }
}
