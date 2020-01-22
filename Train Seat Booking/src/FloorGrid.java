
public abstract class FloorGrid {
	/**
	 * Initialising Instance members
	 */
	protected int nRows;
	protected int nColumns;
	protected Seat[][] seats; 
	protected int nFirstClassRows;
	
	public FloorGrid(int nR, int nC) {
		nRows= nR;
		nColumns= nC;
		seats= new Seat[nRows][nColumns];
	}
	/**
	 * Abstract method to be overriden by child classes
	 */
	protected abstract void initialiseFloorGrid();
	
	/**
	 * 
	 * @returns the last column position
	 */
	public char lastSeatPosition() {
		return seats[0][seats[0].length-1].getSeatPosition().getColumn() ;
	}
	/**
	 * 
	 * @returns the last row position
	 */
	public int lastSeatRow() {
		return nRows;
	}
	
	/**
	 * 
	 * @param S: Seat object
	 * @returns the left seat of the given seat
	 */
	public Seat getLeft( Seat S) {
		for(int i=0; i<seats.length; i++) {
			for (int j=0;j<seats.length;j++) {
				if (S.equals(seats[i][j]))
					return seats[i][j-1];
			}
		}
		return null;
	}
	/**
	 * 
	 * @param S: Seat Object
	 * @returns the Right seat of the given seat
	 */
	public Seat getRight (Seat S) {
		for(int i=0; i<seats.length; i++) {
			for (int j=0;j<seats.length;j++) {
				if (S.equals(seats[i][j]))
					return seats[i][j+1];
			}
		}
		return null;
	}
	
	/**
	 * Represents a visual representation of the floor grid
	 */
	public String toString() {
		String S="";
		for(int i=0; i<seats.length; i++) {
			for (int j=0;j<seats.length;j++) {
				S= seats[i][j].toString()+ "/t";
			}
			S+="/n";
		}
		return S;
		
	}
	/**
	 * 
	 * @param aType: SeatType 
	 * @returns a Seat with the given seat type in economy class
	 */
	public Seat queryAvailableEconomySeat(SeatType aType) {
		for(int i=0; i<seats.length; i++) {
			for (int j=0;j<seats.length;j++) {
				if (seats[i][j].getSeatType().equals(aType) && seats[i][j].isReserved()== false && seats[i][j].isFirstClass()== false)
					return seats[i][j];
				else if (seats[i][j].isReserved()== false  && seats[i][j].isFirstClass()== false)
					return seats[i][j];
					
			}
		}
		return null;
	}
	
	/**
	 * @param aType: SeatType 
	 * @returns a Seat with the given seat type in First class
	 */
	public Seat queryAvailableFirstClassSeat(SeatType aType) {
		for(int i=0; i<10; i++) {
			for (int j=0;j<7;j++) {
				if (seats[i][j].getSeatType().equals(aType) && seats[i][j].isReserved()== false && seats[i][j].isFirstClass()== true)
					return seats[i][j];
				else if (seats[i][j].isReserved()== false  && seats[i][j].isFirstClass()== true)
					return seats[i][j];
					
			}
		}
		return null;
	}
	/**
	 * 
	 * @param I: Row num
	 * @param C: Column ID
	 * @returns a seat according to the given row and column
	 */
	public Seat getSeat(int I, char C) {
		for(int i=0; i<seats.length; i++) {
			for (int j=0;j<seats.length;j++) {
				if (seats[i][j].getSeatPosition().equals(new SeatPosition(I,C)))
					return seats[i][j];
			}
		}
		return null;
	}
}
