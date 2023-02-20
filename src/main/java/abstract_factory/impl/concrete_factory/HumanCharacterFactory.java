package abstract_factory.impl.concrete_factory;

import abstract_factory.impl.concrete_game_character.elf.WizardElf;
import abstract_factory.impl.concrete_game_character.human.ArcherHuman;
import abstract_factory.impl.concrete_game_character.human.WarriorHuman;
import abstract_factory.impl.concrete_game_character.human.WizardHuman;
import abstract_factory.interfaces.abs_factory.AbstractFactory;
import abstract_factory.interfaces.abs_product.Archer;
import abstract_factory.interfaces.abs_product.Warrior;
import abstract_factory.interfaces.abs_product.Wizard;

public class HumanCharacterFactory implements AbstractFactory {
    @Override
    public ArcherHuman createArcher(String name, int hp, int level) {
        return new ArcherHuman(name, hp, level);
    }

    @Override
    public WarriorHuman createWarrior(String name, int hp, int level) {
        return new WarriorHuman(name, hp, level);
    }

    @Override
    public WizardHuman createWizard(String name, int hp, int level) {
        return new WizardHuman(name, hp, level);
    }
}
