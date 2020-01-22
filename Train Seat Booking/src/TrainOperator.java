
public abstract class TrainOperator {
	/**
	 * Decaring Instance variable
	 */
	private String operatorName;
	
	/**
	 * Abstract Methods to be written by child class
	 * @param aJourney: TrainJourney
	 * @param aType: SeatType
	 * @returns Seat
	 */
	abstract public Seat reserveFirstClass(TrainJourney aJourney,SeatType aType);
	abstract public Seat reserveEconomy(TrainJourney aJourney,SeatType aType);
	/**
	 * Default Constructor
	 * @param ON: Operator Name
	 */
	public TrainOperator(String ON) {
		this.operatorName = ON;
	}
	/**
	 * Getter /Setters
	 * @returns Operator name
	 */
	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String OpN) {
		this.operatorName = OpN;
	}
	/**
	 * Returns a brief description of the class
	 */
	public String toString() {
		return "Train Operator Name : " + operatorName;
	}
}
