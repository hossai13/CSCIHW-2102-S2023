package HW4;

public class MathGames {
    public static void main(String[] args) {
        System.out.println("Start of Math Games");
        L1 level1 = new L1();
        System.out.println("LEVEL 1 SCORE: " + level1.score1);
        L2 level2 = new L2();
        System.out.println("LEVEL 2 SCORE: " + level2.score2);
        L3 level3 = new L3();
        System.out.println("LEVEL 3 SCORE: " + level3.score3);
        
        int score = level1.score1 + level2.score2 + level3.score3;
        System.out.println("\nFINAL SCORE: " + score);
        System.out.println("End of Math Games");
    }
}
