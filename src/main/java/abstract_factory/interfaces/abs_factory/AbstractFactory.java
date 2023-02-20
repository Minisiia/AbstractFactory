package abstract_factory.interfaces.abs_factory;

import abstract_factory.interfaces.abs_product.Archer;
import abstract_factory.interfaces.abs_product.Warrior;
import abstract_factory.interfaces.abs_product.Wizard;

public interface AbstractFactory {
    Archer createArcher(String name, int hp, int level);

    Warrior createWarrior(String name, int hp, int level);

    Wizard createWizard(String name, int hp, int level);
}
