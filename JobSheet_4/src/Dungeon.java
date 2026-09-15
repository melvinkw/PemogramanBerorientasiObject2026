import java.util.ArrayList;

public class Dungeon {
    private String dungeonName;
    private ArrayList<DungeonRoom> roomList;

    public Dungeon(String name) {
        this.dungeonName = name;
        this.roomList = new ArrayList<>();
    }

    public void setDungeonName(String name) {
        this.dungeonName = name;
    }

    public String getDungeonName() {
        return dungeonName;
    }

    public ArrayList<DungeonRoom> getRoomList() {
        return roomList;
    }

    public void addRoom(DungeonRoom r) {
        roomList.add(r);
    }
    
    public void printDungeonInfo() {
        System.out.println("=== " + dungeonName + " ===");
        System.out.println("Jumlah Ruangan: " + roomList.size());
        System.out.println("--------------------");
        for (DungeonRoom room : roomList) {
            room.printRoomInfo();
            System.out.println("-");
        }
    }
}