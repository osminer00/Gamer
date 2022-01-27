package model;

/**
 * @author Owen Miner - osminer
 * CIS175 - Fall 2021
 * Jan 27, 2022
 */
public class Gamer {
	private String name;
	private String favoriteGame;
	private int totalGames;
	
	public Gamer() { //default constructor
		this.name = "";
		this.favoriteGame = "";
		this.totalGames = 0;
	}
	public Gamer(String name) { //non-default constructor for name only
		this.name = name;
		this.favoriteGame = "";
		this.totalGames = 0;
	}
	public Gamer(String name, String favoriteGame, int totalGames) { //non-default constructor for all variables
		this.name = name;
		this.favoriteGame = favoriteGame;
		this.totalGames = totalGames;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavoriteGame() {
		return favoriteGame;
	}
	public void setFavoriteGame(String favoriteGame) {
		this.favoriteGame = favoriteGame;
	}
	public int getTotalGames() {
		return totalGames;
	}
	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}
	
	//method to determine if someone is a gamer based on if they have a favorite game and more than 5 games
	public boolean isGamer() {
		boolean trueGamer = false;
		if (!favoriteGame.equals("") && totalGames > 5) {
			trueGamer = true;
		}
		return trueGamer;
	}
	
	public String biggerGamer(Gamer g1, Gamer g2) {
		String bGamer ="";
		
		if (g1.getTotalGames() > g2.getTotalGames()) {
			bGamer = g1.getName();
		}else if(g1.getTotalGames() < g2.getTotalGames()) {
			bGamer = g2.getName();
		}else {
			bGamer = "Both Gamers are Equal";
		}
		System.out.println(bGamer);
		return bGamer;
	}
		
}
