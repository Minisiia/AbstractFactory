package abstract_factory.impl.concrete_game_character.human;

import abstract_factory.interfaces.abs_product.Wizard;

public class WizardHuman implements Wizard {
    private String name;
    private int hp;
    private int level;
    private String ability = " casts spells!";

    public WizardHuman() {
    }

    public WizardHuman(String name, int hp, int level) {
        this.name = name;
        this.hp = hp;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "WizardHuman{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", ability='" + ability + '\'' +
                '}';
    }

    @Override
    public void callSpecialAbility() {
        System.out.println("Elves are coming! Wizards! Get ready! " + name + ability);
    }
}
