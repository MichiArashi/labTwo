package pokemon;

import ru.ifmo.se.pokemon.*;

class Doduo extends Pokemon {
    public Doduo(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(180, 157, 85, 67, 67, 139);
        setMove(new Rest(), new WorkUp(), new Facade());
    }
}
class Shuckle extends Pokemon{
    public Shuckle(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ROCK);
        setStats(150, 22, 418, 22, 418, 13);
        setMove(new Facade(), new Bulldoze(), new SludgeBomb(), new Withdraw());
    }
}
class Dodrio extends Doduo{
    public Dodrio(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(230, 202, 130, 112, 112, 202);
        setMove(new TriAttack());
    }
}
class Chimchar extends Pokemon{
    public Chimchar(String name, int level){
        super(name, level);
        setType(Type.FIRE);
        setStats(198, 108, 83, 108, 83,114);
        setMove(new Flamethrower(), new WillOWisp());
    }
}
class  Monferno extends Chimchar{
    public Monferno (String name, int level){
        super(name, level);
        setStats(238, 144, 98, 144, 98, 150);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new SlackOff());
    }
}
class  Infernape extends Monferno{
    public Infernape (String name, int level){
        super(name, level);
        setStats(262, 191, 132, 191, 132, 198);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new FlameCharge());
    }
}