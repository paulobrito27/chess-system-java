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
	
	//------------------------------------M�TODOS-----------------------------------------------
	
	public Piece piece(int row , int collumn ) {
		return this.pieces[row][collumn];
	}
	
	public Piece piece(Position position) {
		return this.pieces[position.getRow()][position.getColumn()];
	}

}
