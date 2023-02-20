package abstract_factory.impl.concrete_factory;

import abstract_factory.impl.concrete_game_character.elf.ArcherElf;
import abstract_factory.impl.concrete_game_character.elf.WarriorElf;
import abstract_factory.impl.concrete_game_character.elf.WizardElf;
import abstract_factory.interfaces.abs_factory.AbstractFactory;
import abstract_factory.interfaces.abs_product.Archer;
import abstract_factory.interfaces.abs_product.Warrior;
import abstract_factory.interfaces.abs_product.Wizard;

public class ElfCharacterFactory implements AbstractFactory {
    @Override
    public ArcherElf createArcher(String name, int hp, int level) {
        return new ArcherElf(name, hp, level);
    }

    @Override
    public WarriorElf createWarrior(String name, int hp, int level) {
        return new WarriorElf(name, hp, level);
    }

    @Override
    public WizardElf createWizard(String name, int hp, int level) {
        return new WizardElf(name, hp, level);
    }
}
