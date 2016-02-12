package level3;

import java.util.ArrayList;
import java.util.Comparator;
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
	public ArrayList<Player> getWinner1(){
		players.sort(new Pcomp());
		return players;
		
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

	public Player getWinner() {
		int MaxScore = 0;
		Player player = null;
		for (Player player1 : players) {
			player1.getKills();
			if (player1.getKills() > MaxScore) {
				MaxScore = player1.getKills();
						player = player1;
			}
		}
		return null;

	}
//︻デ┳═ー 
	public void play() {
		while (!isOver()) {
			Random r = new Random();
			int b = r.nextInt(players.size());
			int c = r.nextInt(players.size());

			Player Player1 = players.get(b);
			Player Player2 = players.get(c);
			if (Player1.equals(Player2)) {
				System.out.println(Player1.getName() + " made mistakes (╯°□°）╯︵ ┻━┻");
			}
			else {
				System.out.println("" + Player1.getName() + " ︻デ┳═ー " + Player2.getName());
			}
				
			
			Player1.shoot(Player2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	public class Pcomp implements Comparator<Player> {

		@Override
		public int compare(Player o1, Player o2) {
			// TODO Auto-generated method stub
			return o1.getKills() - o2.getKills();
		}

	}
}
