package abstract_factory;

import abstract_factory.client.Game;
import abstract_factory.impl.concrete_factory.ElfCharacterFactory;
import abstract_factory.impl.concrete_factory.HumanCharacterFactory;
import abstract_factory.interfaces.abs_factory.AbstractFactory;

/**
 * Create a game using the Abstract Factory pattern.
 * The game should have a set of characters, including warriors, mages, and archers.
 * The characters should belong to either the human or elf race.
 * The Abstract Factory should provide an interface for creating these characters, and concrete factories should be implemented for each race.
 * The client should be able to switch between the different concrete factories to create different sets of characters.
 * Finally, the game should be able to print out the stats of each character, including their name, health, level, and abilities.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory elfFactory = new ElfCharacterFactory();
        AbstractFactory humanFactory = new HumanCharacterFactory();
        Game game = new Game(elfFactory);
        // create elves
        game.createArcherCharacter("Venti", 20000, 50);
        game.createWarriorCharacter("Ayaka", 18000, 52);
        game.createWizardCharacter("Klee", 16000, 49);
        game.showAllCharacters();
        // create human
        game.switchRace(humanFactory);
        game.createArcherCharacter("Ganyu", 25000, 55);
        game.createWarriorCharacter("Ayato", 28000, 48);
        game.createWizardCharacter("Mona", 15000, 55);
        game.showAllCharacters();
        // call special abilities
        game.callCharacterSpecialAbility("Venti");
        game.callCharacterSpecialAbility("Ayato");
        game.callCharacterSpecialAbility("Klee");
    }
}
