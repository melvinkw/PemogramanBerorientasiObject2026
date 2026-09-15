public class BossMonster extends Monster {
    private String ultimateSkill;
    private boolean enragePhase;

    public BossMonster(String name, int hp, String skill) {
        super(name, hp); 
        this.ultimateSkill = skill;
        this.enragePhase = false;
    }

    public void setUltimateSkill(String skill) {
        this.ultimateSkill = skill;
    }

    public String getUltimateSkill() {
        return ultimateSkill;
    }

    public void setEnragePhase(boolean enraged) {
        this.enragePhase = enraged;
    }

    public boolean isEnragePhase() {
        return enragePhase;
    }

    public void useUltimate() {
        if (enragePhase == true) {
            System.out.println(getName() + " mengeluarkan ultimate: " + ultimateSkill + "!");
        } else {
            System.out.println(getName() + " mencoba ultimate, tapi belum dalam fase enrage!");
        }
    }
}