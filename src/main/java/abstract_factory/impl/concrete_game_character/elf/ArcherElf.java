package abstract_factory.impl.concrete_game_character.elf;

import abstract_factory.interfaces.abs_product.Archer;

public class ArcherElf implements Archer {
    private String name;
    private int hp;
    private int level;
    private String ability = " shoots arrows!";

    public ArcherElf() {
    }

    public ArcherElf(String name, int hp, int level) {
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
        return "ArcherElf{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", ability='" + ability + '\'' +
                '}';
    }

    @Override
    public void callSpecialAbility() {
        System.out.println("Human are coming! Elf archers! Get ready! " + name + ability);
    }
}
