package tabuleiro;

public class Board {

	private Integer rows;
	private Integer columns;

	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro na cria��o do tabuleiro: N�o podem existir menos de 1 linha ou 1 coluna!");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	// ------------------------------------M�TODOS-----------------------------------------------

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posi��o n�o existe no tabuleiro");
		}
		return this.pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posi��o n�o existe no tabuleiro");
		}
		return this.pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPeace(position)) {
			throw new BoardException("J� existe uma pe�a na posi��o: " + position);
		}
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPeace(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posi��o n�o existe no tabuleiro");
		}
		return piece(position) != null;
	}
}
