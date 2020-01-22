
public class PetiteFloorGrid extends FloorGrid {
	/**
	 * Default constructor initialises Petite Floor
	 */
	public PetiteFloorGrid() {
		super(10,7);
		this.nFirstClassRows = 4;
		initialiseFloorGrid();
	}
	/**
	 * Overridden method from floor grid class Initialises floor grid
	 */
	@Override
	protected void initialiseFloorGrid() {
		
		int n=0;
		/**
		 * Setting the first class part
		 */
		for (int i=0 ; i<5; i++) {
			this.seats[i][n] = new Seat(new SeatPosition(i,'A'),SeatType.Window,true);
			this.seats[i][n+1] = new Seat(new SeatPosition(i,'B'),SeatType.AISLE,true);
			this.seats[i][n+2] = new Seat(new SeatPosition(i,'C'),SeatType.AISLE,true);
			this.seats[i][n+3] = new Seat(new SeatPosition(i,'D'),SeatType.MIDDLE,true);
			this.seats[i][n+4] = new Seat(new SeatPosition(i,'E'),SeatType.AISLE,true);
			this.seats[i][n+5] = new Seat(new SeatPosition(i,'F'),SeatType.AISLE,true);
			this.seats[i][n+6] = new Seat(new SeatPosition(i,'G'),SeatType.Window,true);
		}
		/**
		 * Setting the economy class part
		 */
		for(int j=0; j<7;j++) {
			this.seats[j][n] = new Seat(new SeatPosition(j,'A'),SeatType.Window,false);
			this.seats[j][n+1] = new Seat(new SeatPosition(j,'B'),SeatType.AISLE,false);
			this.seats[j][n+2] = new Seat(new SeatPosition(j,'C'),SeatType.AISLE,false);
			this.seats[j][n+3] = new Seat(new SeatPosition(j,'D'),SeatType.MIDDLE,false);
			this.seats[j][n+4] = new Seat(new SeatPosition(j,'E'),SeatType.AISLE,false);
			this.seats[j][n+5] = new Seat(new SeatPosition(j,'F'),SeatType.AISLE,false);
			this.seats[j][n+6] = new Seat(new SeatPosition(j,'G'),SeatType.Window,false);
		}
		
		
		
	}

}
