package pokemon;

import ru.ifmo.se.pokemon.*;

class Facade extends PhysicalMove {
    public Facade() {
        type = Type.NORMAL;
        power = 70;
        accuracy = 100;
        priority = 20;
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status status = p.getCondition();
        if (status.equals(Status.BURN) || status.equals(Status.PARALYZE) || status.equals(Status.POISON)) {
            p.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "применил Facade";
    }
}
class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        type = Type.GROUND;
        power = 60;
        accuracy = 100;
        priority = 20;
    }
    @Override
    protected void applyOppDamage(Pokemon p,double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "применил Bulldoze";
    }
}
class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        type = Type.POISON;
        power = 90;
        accuracy = 100;
        priority = 10;
    }

    @Override
    protected void applyOppDamage(Pokemon p,double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.poison(p);
    }
    @Override
    protected String describe() {
        return "применил Sludge Bomb";
    }
}
class Withdraw extends StatusMove {
    public Withdraw() {
        type = Type.WATER;
        power = 0;
        accuracy = 0;
        priority = 40;
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    @Override
    protected String describe() {
        return "применил Withdraw";
    }
}
class Rest extends StatusMove {
    public Rest() {
        type =Type.PSYCHIC;
        power = 0;
        accuracy = 0;
        priority = 5;
    }
    Effect e = new Effect().turns(2);
    @Override
    protected void applySelfEffects(Pokemon p) {
        e.sleep(p);
        p.restore();
    }
    @Override
    protected String describe() {
        return "хочет спать!";
    }
}
class TriAttack extends SpecialMove {
    public TriAttack() {
        type = Type.NORMAL;
        power = 80;
        accuracy = 100;
        priority = 10;
    }
    @Override
    protected void applyOppDamage(Pokemon p,double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) {
            if (Math.random() <= 0.0667) Effect.paralyze(p);
            else if (Math.random() <= 0.0667) Effect.burn(p);
            else Effect.freeze(p);
        }
    }
    @Override
    protected String describe() {
        return "применил Tri Attack";
    }
}
class WorkUp extends  StatusMove{
    public WorkUp(){
        type=Type.NORMAL;
        power=0;
        accuracy=0;
        priority=30;
    }
    protected void applySelfEffect(Pokemon p){
        p.setMod(Stat.ATTACK,1);
        p.setMod(Stat.SPECIAL_ATTACK,1);

    }
    @Override
    protected String describe(){
        return "применил Work Up";
    }
}
class Flamethrower extends  SpecialMove{
    public Flamethrower(){
        type=Type.FIRE;
        power=90;
        accuracy=100;
        priority=15;
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.1){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "применил Flamethrower";
    }
}
class WillOWisp extends StatusMove{
    public WillOWisp(){
        type = Type.FIRE;
        power = 0;
        accuracy = 85;
        priority = 15;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.burn(p);
        p.setMod(Stat.ATTACK, (int) (-1*(p.getStat(Stat.ATTACK)*0.5)));
    }
    @Override
    protected String describe(){
        return "применил Will-O-Wisp";
    }
}
class SlackOff extends  StatusMove{
    public SlackOff(){
        type=Type.NORMAL;
        power=0;
        accuracy=0;
        priority=5;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) (-1*p.getStat(Stat.HP)*0.5));
    }

    @Override
    protected String describe(){
        return "применил Slack Off";
    }
}
class FlameCharge extends  PhysicalMove{
    public FlameCharge(){
        type=Type.FIRE;
        power=50;
        accuracy=100;
        priority=20;
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 1);
    }

    @Override
    protected String describe(){
        return "применил Flame Charge";
    }
}