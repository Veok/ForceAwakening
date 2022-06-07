package pl.pjait.profession;

import pl.pjait.Ability;
import pl.pjait.race.Race;

import java.util.List;

public class Wizard extends ProfessionDecorator {
    private final Race race;

    public Wizard(Race race) {
        this.race = race;
        race.abilities().add(Ability.MAGIC);
        race.abilities().add(Ability.ALCHEMIST);
    }

    @Override
    public List<Ability> abilities() {
        return race.abilities();
    }
}
