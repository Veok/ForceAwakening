package pl.pjait.profession;

import pl.pjait.Ability;
import pl.pjait.race.Race;

import java.util.List;

public class Assassin extends ProfessionDecorator {
    private final Race race;

    public Assassin(Race race) {
        this.race = race;
        race.abilities().add(Ability.SNEAKING);
        race.abilities().add(Ability.POISONING);
        race.abilities().add(Ability.HAND_TO_HAND_COMBAT);
    }

    @Override
    public List<Ability> abilities() {
        return race.abilities();
    }
}
