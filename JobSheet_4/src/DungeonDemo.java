public class DungeonDemo {
    public static void main(String[] args) {
        Dungeon myDungeon = new Dungeon("Gua Naga Hitam");

        DungeonRoom room1 = new DungeonRoom(1, "Ruang Depan");
        DungeonRoom room2 = new DungeonRoom(2, "Ruang Bos");

        Monster monster1 = new Monster("Goblin", 50);
        Monster monster2 = new Monster("Orc", 120);
        Monster monster3 = new Monster("Skeleton", 80);
        
        BossMonster naga = new BossMonster("Naga Hitam", 1000, "Semburan Api Hitam");

        room1.addMonster(monster1);
        room1.addMonster(monster2);
        room1.addMonster(monster3);
        
        room2.setBoss(naga);
        
        myDungeon.addRoom(room1);
        myDungeon.addRoom(room2);

        myDungeon.printDungeonInfo();
        
        System.out.println("\n=== PENJELAJAHAN " + myDungeon.getDungeonName().toUpperCase() + " DIMULAI ===");
        
        System.out.println("\n[Memasuki Ruangan " + room1.getRoomNumber() + " : " + room1.getRoomType() + "]");
        System.out.println("Player disergap oleh sekelompok monster penjaga!");
        
        monster1.attack();
        monster2.attack();
        monster3.attack();
        
        System.out.println("Player melawan balik dan berhasil membersihkan " + room1.getRoomType() + "!");

        System.out.println("\n[Melanjutkan ke Ruangan " + room2.getRoomNumber() + " : " + room2.getRoomType() + "]");
        System.out.println("Pintu Utama terbuka... Boss " + naga.getName() + " menghadang!");
        
        System.out.println("\n--- Pertarungan Boss Dimulai ---");
        naga.attack();
        naga.useUltimate(); 
        
        System.out.println("\n(Player melancarkan serangan bertubi-tubi, darah " + naga.getName() + " menipis!)");
        
        naga.setEnragePhase(true); 
        System.out.println(naga.getName() + " memasuki fase enrage!");
        
        naga.useUltimate();
        
        System.out.println("\nSelamat! Player berhasil menaklukkan " + myDungeon.getDungeonName() + "!");
    }
}