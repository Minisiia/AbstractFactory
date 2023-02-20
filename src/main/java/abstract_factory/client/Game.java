package abstract_factory.client;

import abstract_factory.interfaces.abs_factory.AbstractFactory;
import abstract_factory.interfaces.abs_product.Archer;
import abstract_factory.interfaces.abs_product.Warrior;
import abstract_factory.interfaces.abs_product.Wizard;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private AbstractFactory af;
    private List<Archer> archers;
    private List<Warrior> warriors;
    private List<Wizard> wizards;

    public Game(AbstractFactory af) {
        this.af = af;
        archers = new ArrayList<>();
        warriors = new ArrayList<>();
        wizards = new ArrayList<>();
    }

    /**
     * Sets the AbstractFactory to be used to create characters
     *
     * @param af the AbstractFactory to use
     */
    public void switchRace(AbstractFactory af) {
        this.af = af;
    }

    /**
     * Creates an Archer character with the specified name, hit points, and level, using the current AbstractFactory
     *
     * @param name  the name of the Archer character to create
     * @param hp    the initial health of the Archer character
     * @param level level the initial level of the Archer character
     */
    public void createArcherCharacter(String name, int hp, int level) {
        archers.add(af.createArcher(name, hp, level));
    }

    /**
     * Creates a Warrior character with the specified name, hit points, and level, using the current AbstractFactory
     *
     * @param name  the name of the Warrior character to create
     * @param hp    the initial health of the Warrior character
     * @param level the initial level of the Warrior character
     */
    public void createWarriorCharacter(String name, int hp, int level) {
        warriors.add(af.createWarrior(name, hp, level));
    }

    /**
     * Creates a Wizard character with the specified name, hit points, and level, using the current AbstractFactory
     *
     * @param name  the name of the Wizard character to create
     * @param hp    the initial health of the Wizard character
     * @param level the initial level of the Wizard character
     */
    public void createWizardCharacter(String name, int hp, int level) {
        wizards.add(af.createWizard(name, hp, level));
    }

    /**
     * Prints the details of all created characters to the console
     */
    public void showAllCharacters() {
        System.out.println("Archers:");
        for (Archer temp : archers) System.out.println(temp);
        System.out.println("Warriors:");
        for (Warrior temp : warriors) System.out.println(temp);
        System.out.println("Wizards:");
        for (Wizard temp : wizards) System.out.println(temp);
    }

    /**
     * Calls the special ability of the character with the specified name
     *
     * @param name he name of the character to call the special ability for
     */
    public void callCharacterSpecialAbility(String name) {
        Archer archer = null;
        Warrior warrior = null;
        Wizard wizard = null;
        for (Archer temp : archers) {
            archer = temp;
            if (!archer.getName().equals(name))
                archer = null;
            if (archer != null) {
                archer.callSpecialAbility();
                break;
            }
        }

        if (archer == null) {
            for (Warrior temp : warriors) {
                warrior = temp;
                if (!warrior.getName().equals(name))
                    warrior = null;
                if (warrior != null) {
                    warrior.callSpecialAbility();
                    break;
                }
            }
        }

        if (archer == null && warrior == null) {
            for (Wizard temp : wizards) {
                wizard = temp;
                if (!wizard.getName().equals(name))
                    wizard = null;
                if (wizard != null) {
                    wizard.callSpecialAbility();
                    break;
                }
            }
        }

        if (archer == null && warrior == null && wizard == null)
            System.out.println("There are no character with name " + name);
    }
}
