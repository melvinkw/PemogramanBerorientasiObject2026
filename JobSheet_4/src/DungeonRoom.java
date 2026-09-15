import java.util.ArrayList;

public class DungeonRoom {
    private int roomNumber;
    private String roomType;
    
    private ArrayList<Monster> monsters;
    private BossMonster boss;

    public DungeonRoom(int number, String type) {
        this.roomNumber = number;
        this.roomType = type;
        this.monsters = new ArrayList<>();
    }

    public void setRoomType(String type) {
        this.roomType = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void addMonster(Monster m) {
        monsters.add(m);
    }

    public void setBoss(BossMonster boss) {
        this.boss = boss;
    }
    
    public void printRoomInfo() {
        System.out.println("Ruangan " + roomNumber + " (" + roomType + ")");
        System.out.println("Jumlah monster biasa: " + monsters.size());
        if (boss != null) {
            System.out.println("Boss Penjaga: " + boss.getName());
        } else {
            System.out.println("Tidak ada boss penjaga di ruangan ini.");
        }
    }
}