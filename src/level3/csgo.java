package level3;

public class csgo {
	public static void main(String[] args) {
		Player Cole = new Player("Cole", true);
		Player Shiva = new Player("Shiva", false);
		Player James = new Player("James", true);
		Player Jack = new Player("Jack", false);
		Game a1 = new Game("de_Dust2", 10);
		a1.connect(Cole);
		a1.connect(Shiva);
		a1.connect(Jack);
		a1.connect(James);
		a1.play();
		for (Player p : a1.getWinner1()) {
			System.out.println(p.getName() + " got a score of " + p.getKills());

		}
	}

}