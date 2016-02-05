package level3;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	String map;
	int maxKills;
	ArrayList<Player> players;

	public Game(String map, int maxKills) {
		this.map = map;
		this.maxKills = maxKills;
		players = new ArrayList<>();
	}

	public void connect(Player player) {
		players.add(player);
	}

	boolean isOver() {
		for (Player player : players) {
			if (player.getKills() >= maxKills) {
				return true;
			}
		}
		return false;

	}

	public void play() {
		while (!isOver()) {
			Random r = new Random();
			int b = r.nextInt(players.size());
			int c = r.nextInt(players.size());
			
			Player Player1 = players.get(b);
			Player Player2 = players.get(c);
		
			Player1.shoot(Player2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(""+Player1.getName()+" ︻デ┳═ー " + Player2.getName());
		}

	}
}
