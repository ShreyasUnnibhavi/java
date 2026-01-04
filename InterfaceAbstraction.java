// Game where there are three characters namely human, ghost and robot
// All three characters have a name and health  (abtract class implementation)
// only ghosts can fly (interface implementation)
// only robots can recharge (interface implementation) 
// characters decide how they die (abstract implementation)
public class InterfaceAbstraction {
    public static void main(String[] args) {
        Human man = new Human("man" , 100);
        Ghost me = new Ghost("me" , 200);
        Robot chitti = new Robot("chitti", 300);
        man.die();
        me.fly();
        me.die();
        chitti.recharge();
        chitti.die();
    }
}
abstract class GameCharacter{
    String name;
    int health;
    
    GameCharacter(String name, int health){
        this.name = name;
        this.health = health;
    }

    abstract void die();
}

interface Flyable{
    void fly();
}

interface Rechargeable{
    void recharge();
}

//implementation for ghost
class Ghost extends GameCharacter implements Flyable{
    
    Ghost(String name, int health){
        super(name,health);
    }

    @Override
    public void fly(){
        System.out.println(this.name + " flies");
    }

    @Override
    public void die(){
        System.out.println(this.name + " dies after falling down");
    }
}

//implementation for robot
class Robot extends GameCharacter implements Rechargeable{

    Robot(String name, int health){
        super(name, health);
    }

    @Override
    public void recharge(){
        System.out.println(this.name + " recharged");
    }

    @Override
    public void die(){
        System.out.println(this.name + " dies after low charge");
    }
}

//implementation for human
class Human extends GameCharacter{
    
    Human(String name, int health){
        super(name,health);
    }

    @Override
    public void die(){
        System.out.println(this.name + " is killed");
    }
}