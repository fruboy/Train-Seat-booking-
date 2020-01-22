
public class SeatPosition {
	/**
	 * Initialising members
	 */
	private int row;
	private char column;
	/**
	 * Parameterised Constructor
	 * @param r: row number
	 * @param c: Column number
	 */
	public SeatPosition(int r , char c) {
		this.row = r;
		this.column = c;
	}
	/**
	 * 
	 * @returns the row number
	 */
	public int getRow() {
		return this.row;
	}
	/**
	 * 
	 * @returns the column number
	 */
	public char getColumn() {
		return this.column;
	}
}
