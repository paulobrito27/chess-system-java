package tabuleiro;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.board = null;
	}

	protected Board getBoard() {
		return board;
	}

}
