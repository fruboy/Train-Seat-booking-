
public class Seat {
	/**
	 * Initialising Instance members
	 */
	private SeatType seatType;
	private boolean firstClass;
	private boolean reserved;
	private SeatPosition seatPosition;
	/**
	 * Parameterised Constructor
	 * @param Spos: seatPosition
	 * @param Stype: seatType
	 * @param FC: is first class?
	 */
	public Seat(SeatPosition Spos, SeatType Stype, boolean FC) {
		this.seatPosition= Spos;
		this.seatType = Stype;
		this.firstClass = FC;
	}
	/**
	 * Getters / Setters
	 * @return
	 */
	public SeatType getSeatType() {
		return this.seatType;
	}
	public SeatPosition getSeatPosition() {
		return this.seatPosition;
	}
	public void setReserved(boolean Res) {
		this.reserved =Res;
	}
	/**
	 * 
	 * @returns is first class?
	 */
	public boolean isFirstClass() {
		return this.firstClass;
	}
	/**
	 * 
	 * @returns is reserved?
	 */
	public boolean isReserved() {
		return this.reserved;
	}
	
	/**
	 * 
	 * @returns a brief description of the Seat
	 */
	public String toDescription() {
		if (this.firstClass == true && this.reserved == true)
			return "First Class " +this.seatType + " seat at : " + this.seatPosition.toString()+" is Booked";
		else if (this.firstClass == true && this.reserved == false)
			return "First Class " +this.seatType + " seat at : " + this.seatPosition+" is not Booked";
		else if (this.firstClass == false && this.reserved == false)
			return "Economy Class " +this.seatType + " seat at : " + this.seatPosition+" is not Booked";
		else
			return "First Class " +this.seatType + " seat at : " + this.seatPosition+" is  Booked";
	}
	/**
	 * Returns the position of the seat in this format [A _]
	 */
	public String toString() {
		if (this.firstClass==true && this.reserved == false && this.seatType == SeatType.AISLE )
			return "[A _]";
		else if(this.firstClass==true && this.reserved == false && this.seatType == SeatType.MIDDLE)
			return "[M _]";
		else if(this.firstClass==true && this.reserved == false && this.seatType == SeatType.Window)
			return "[W _]";
		else if(this.firstClass==true && this.reserved == true && this.seatType == SeatType.MIDDLE)
			return "[M X]";
		else if (this.firstClass==true && this.reserved == true && this.seatType == SeatType.AISLE )
			return "[A X]";
		else if (this.firstClass==true && this.reserved == true && this.seatType == SeatType.Window )
			return "[W X]";
		else if (this.firstClass==false && this.reserved == false && this.seatType == SeatType.AISLE )
			return "[a _]";
		else if(this.firstClass==false && this.reserved == false && this.seatType == SeatType.MIDDLE)
			return "[m _]";
		else if(this.firstClass==false && this.reserved == false && this.seatType == SeatType.Window)
			return "[w _]";
		else if(this.firstClass==false && this.reserved == true && this.seatType == SeatType.MIDDLE)
			return "[m X]";
		else if (this.firstClass==false && this.reserved == true && this.seatType == SeatType.AISLE )
			return "[a X]";
		else if (this.firstClass==false && this.reserved == true && this.seatType == SeatType.Window )
			return "[w X]";
		else
			return null;
	}
}
