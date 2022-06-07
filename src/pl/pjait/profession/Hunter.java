package pl.pjait.profession;

import pl.pjait.Ability;
import pl.pjait.race.Race;

import java.util.List;

public class Hunter extends ProfessionDecorator {
    private final Race race;

    public Hunter(Race race) {
        this.race = race;
        race.abilities().add(Ability.SNEAKING);
        race.abilities().add(Ability.SHOOTING);
    }

    @Override
    public List<Ability> abilities() {
        return race.abilities();
    }
}
