public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2)); 
    }

    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println("Total Sudut (1 param): " + sgt.totalSudut(90));
        System.out.println("Total Sudut (2 param): " + sgt.totalSudut(90, 45));
        System.out.println("Keliling (3 sisi): " + sgt.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi phytagoras): " + sgt.keliling(3, 4));
    }
}