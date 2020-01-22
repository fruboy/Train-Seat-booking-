
public class TrainJourney {
	/**
	 * Initialising Instance Members
	 */
	private String journeyNumber;
	private String sourceCity;
	private String destCity;
	private String departureTime;
	private FloorGrid seating;
	/**
	 * Parameterised Constructor
	 * @param jN : JourneyNumber
	 * @param sC: Source CIty
	 * @param dC: Destination City
	 * @param dT: Departure Time
	 * @param FG: FloorGrid Seating
	 */
	public TrainJourney(String jN,String sC, String dC,String dT, FloorGrid FG) {
		this.journeyNumber= jN;
		this.sourceCity = sC;
		this.destCity= dC;
		this.departureTime = dT;
		this.seating = FG;
	}
	/**
	 * Getter Setters
	 * @return
	 */
	public String getSourceCity() {
		return this.sourceCity;
	}
	public void setSourceCity(String sC) {
		this.sourceCity = sC;
	}
	public String getDestCity() {
		return this.destCity;
	}
	public void setDestCity(String dC) {
		this.destCity = dC;
	}
	public FloorGrid getSeating() {
		return this.seating;
	}
	public void setSeating(FloorGrid sea) {
		this.seating = sea;
	}
	public String getTime() {
		return this.departureTime;
	}
	public void setTime(String tme) {
		this.departureTime = tme;
	}
	public String getJourneyNumber() {
		return this.journeyNumber;
	}
	/**
	 * TO string Returns a representation of the Class
	 */
	public String toString() {
		return "The Journey Number "+ this.journeyNumber+" is Headed towards " +this.destCity +" from " + this.sourceCity; 
	}
}
