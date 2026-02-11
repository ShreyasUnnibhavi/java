public class InterfaceAbstraction {
    public static void main(String[] args) {
        Robot chitti = new Robot("Chitti", 200);
        Ghost Arundhati = new Ghost("Arundhati", 300);
        Human lala = new Human("Lala", 100);

        System.out.println("character: " + chitti.name + ", health: " + chitti.health + ", " + chitti.recharge() + ", " + chitti.die());
        System.out.println("character: " + Arundhati.name + ", health: " + Arundhati.health + ", " + Arundhati.fly() + ", " + Arundhati.die());
        System.out.println("character: " + lala.name + ", health: " + lala.health + ", " + lala.die());
    }
}

abstract class GameCharacter {
    int health;
    String name;

    GameCharacter(int health, String name) {
        this.health = health;
        this.name = name;
    }

    abstract String die();
}

interface Flyable {
    String fly();
}

interface Rechargeable {
    String recharge();
}

class Robot extends GameCharacter implements Rechargeable {
    Robot(String name, int health) {
        super(health, name);
    }

    //^ Abstract method implementation
    @Override
    public String die() {
        return (this.name + " Died with low battery");
    }

    //* Inherited abstract method implemenmtation
    @Override
    public String recharge() {
        return (this.name + " charged successfully");
    }
} 

class Ghost extends GameCharacter implements Flyable {
    Ghost(String name, int health) {
        super(health, name);
    }

    //^ Abstract method implementation
    @Override
    public String die() {
        return (this.name + " Died from fall");
    }

    //* Inherited abstract method implemenmtation
    @Override
    public String fly() {
        return (this.name + " flew successfully");
    }
} 

class Human extends GameCharacter {
    Human(String name, int health) {
        super(health, name);
    }

    //^ Abstract class implementation
    public String die() {
        return (this.name + " is killed");
    }
}