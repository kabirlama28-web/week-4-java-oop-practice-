class GameCharacter {
    String name;

    GameCharacter(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println("Basic attack");
    }
}

class Warrior extends GameCharacter {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with sword");
    }
}

class Archer extends GameCharacter {
    int arrowCount;

    Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    void attack() {
        System.out.println(name + " shoots arrow");
    }
}

class Mage extends GameCharacter {
    int mana;

    Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    void attack() {
        System.out.println(name + " casts spell");
    }
}

public class GameCharacters {
    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Archer("Robin",20),
                new Mage("Merlin",100)
        };

        for(GameCharacter c : characters) {
            c.attack();
        }
    }
}