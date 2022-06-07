package pl.pjait.profession;

import pl.pjait.Ability;
import pl.pjait.race.Race;

import java.util.List;

public class Fighter extends ProfessionDecorator {
    private final Race race;

    public Fighter(Race race) {
        this.race = race;
        race.abilities().add(Ability.HAND_TO_HAND_COMBAT);
        race.abilities().add(Ability.SWORD_FIGHTING);
        race.abilities().add(Ability.AXE_FIGHTING);
        race.abilities().add(Ability.SPEAR_FIGHTING);
    }

    @Override
    public List<Ability> abilities() {
        return race.abilities();
    }
}
