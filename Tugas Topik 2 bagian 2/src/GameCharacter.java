public class GameCharacter {
    private String name;
    private int lifepoint, attackHitPoint, attackKickPoint;

    public GameCharacter(String  name, int attackHitPoint, int attackKickPoint){
    this.name = name;
    this.lifepoint = 100;
    this.attackHitPoint = attackHitPoint;
    this.attackKickPoint = attackKickPoint;
    }

    public String getName(){
        return name;
    }

    public int getLifepoint() {
        return lifepoint;
    }

    public void hit(GameCharacter karB){
        karB.lifepoint = karB.lifepoint - this.attackHitPoint;
    }

    public void kick(GameCharacter karB){
        karB.lifepoint = karB.lifepoint - this.attackKickPoint;
    }
}
