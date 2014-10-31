package is.ru.TicTacToe;

public class Player {
	private String name;
	private int wins;
	private char symbol;

	public Player(String newName, char newSymbol) {
		name = newName;
		wins = 0;
		symbol = newSymbol;
	}
	

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public int getWins() {
		return wins;
	}
	
	public void increaseWins() {
		this.wins++;
	}
}
