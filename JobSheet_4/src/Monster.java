public class Monster {
    private String name;
    private int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void attack() {
        System.out.println(name + " melakukan serangan dasar!");
    }
}