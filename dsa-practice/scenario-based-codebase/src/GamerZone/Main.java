package GamerZone;

public class Main {
	public static void main(String[] args) {
		Player[] players = {
	            new Player("Alex", 450),
	            new Player("Blaze", 720),
	            new Player("Cypher", 600),
	            new Player("Dynamo", 880),
	            new Player("Echo", 510)
	        };
		
		QuickSort qs = new QuickSort();
        qs.quickSort(players, 0, players.length - 1);

        System.out.println("----------GamerZone Leaderboard----------");
        for (Player p : players) {
            System.out.println(p.name + " - " + p.score);
        }
	}
}
