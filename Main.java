package pokemon;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon shuckle = new Shuckle("",1);
        Pokemon doduo = new Doduo("",1);
        Pokemon dodrio = new Dodrio("",1);
        Pokemon chimchar = new Chimchar("",1);
        Pokemon monferno = new Monferno("",1);
        Pokemon infernape = new Infernape("",1);

        b.addAlly(shuckle);
        b.addAlly(infernape);
        b.addAlly(dodrio);

        b.addFoe(doduo);
        b.addFoe(chimchar);
        b.addFoe(monferno);

        b.go();
    }
}

