package tabuleiro;

public class Board {

	private Integer rows;
	private Integer collumns;

	private Piece[][] pieces;

	public Board(Integer rows, Integer collumns) {
		this.rows = rows;
		this.collumns = collumns;
		this.pieces = new Piece[rows][collumns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getCollumns() {
		return collumns;
	}

	public void setCollumns(Integer collumns) {
		this.collumns = collumns;
	}

}
