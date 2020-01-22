
public class GrandeFloorGrid extends FloorGrid {
	/**
	 * Default Contructor
	 */
	public GrandeFloorGrid() {
		super(12,9);
		this.nFirstClassRows = 6;
		initialiseFloorGrid();
	}
	/**
	 * Overridden method from floor grid class Initialises floor grid
	 */
	@Override
	protected void initialiseFloorGrid() {
		int n=0;
		/**
		 * Making First class Portion
		 */
		for (int i=0 ; i<7; i++) {
			this.seats[i][n] = new Seat(new SeatPosition(i,'A'),SeatType.Window,true);
			this.seats[i][n+1] = new Seat(new SeatPosition(i,'B'),SeatType.MIDDLE,true);
			this.seats[i][n+2] = new Seat(new SeatPosition(i,'C'),SeatType.AISLE,true);
			this.seats[i][n+3] = new Seat(new SeatPosition(i,'D'),SeatType.AISLE,true);
			this.seats[i][n+4] = new Seat(new SeatPosition(i,'E'),SeatType.MIDDLE,true);
			this.seats[i][n+5] = new Seat(new SeatPosition(i,'F'),SeatType.AISLE,true);
			this.seats[i][n+6] = new Seat(new SeatPosition(i,'G'),SeatType.AISLE,true);
			this.seats[i][n+7] = new Seat(new SeatPosition(i,'H'),SeatType.MIDDLE,true);
			this.seats[i][n+8] = new Seat(new SeatPosition(i,'I'),SeatType.Window,true);
		}
		/**
		 * Making Economy class portion
		 */
		for (int i=0 ; i<7; i++) {
			this.seats[i][n] = new Seat(new SeatPosition(i,'A'),SeatType.Window,false);
			this.seats[i][n+1] = new Seat(new SeatPosition(i,'B'),SeatType.MIDDLE,false);
			this.seats[i][n+2] = new Seat(new SeatPosition(i,'C'),SeatType.AISLE,false);
			this.seats[i][n+3] = new Seat(new SeatPosition(i,'D'),SeatType.AISLE,false);
			this.seats[i][n+4] = new Seat(new SeatPosition(i,'E'),SeatType.MIDDLE,false);
			this.seats[i][n+5] = new Seat(new SeatPosition(i,'F'),SeatType.AISLE,false);
			this.seats[i][n+6] = new Seat(new SeatPosition(i,'G'),SeatType.AISLE,false);
			this.seats[i][n+7] = new Seat(new SeatPosition(i,'H'),SeatType.MIDDLE,false);
			this.seats[i][n+8] = new Seat(new SeatPosition(i,'I'),SeatType.Window,false);
			
		}
	}

}
