package level3;

public class Player {
	private String name;
	private int kills;
	private int deaths;
	private boolean T;

	public Player(String name, boolean T) {
		this.name = name;
		this.T = T;
	}

	public void shoot(Player Sw3y_Dim0ndZ) {
		this.kills += 1;
		Sw3y_Dim0ndZ.die();

	}

	public int getKills() {
		return kills;

	}

	public void die() {
		this.deaths += 1;
	}

	public int score() {
		return kills * 5;

	}
	public String getName()
	{
		return name;
	}
}
