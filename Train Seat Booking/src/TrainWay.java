
public class TrainWay extends TrainOperator {
	/**
	 * Default Constructor
	 * @param ON: Operator name
	 */
	public TrainWay(String ON) {
		super(ON);
	}
	/**
	 * reserveFirstClass reserves first class seats according to TrainWay rules
	 */
	@Override
	public Seat reserveFirstClass(TrainJourney aJourney, SeatType aType) {
		if (aJourney.getSeating().queryAvailableFirstClassSeat(aType)!= null) {
			aJourney.getSeating().queryAvailableFirstClassSeat(aType).setReserved(true);
			return aJourney.getSeating().queryAvailableFirstClassSeat(aType);
		}
		else if (aJourney.getSeating().queryAvailableEconomySeat(SeatType.Window)!= null) {
			aJourney.getSeating().queryAvailableEconomySeat(SeatType.Window).setReserved(true);
			return aJourney.getSeating().queryAvailableEconomySeat(SeatType.Window);
		}
		else 
			return null;
	}
	/**
	 * reserveFirstClass reserves Economy class seats according to TrainWay rules
	 */
	@Override
	public Seat reserveEconomy(TrainJourney aJourney, SeatType aType) {
		if (aJourney.getSeating().queryAvailableEconomySeat(aType)!= null) {
			aJourney.getSeating().queryAvailableEconomySeat(aType).setReserved(true);
			return aJourney.getSeating().queryAvailableEconomySeat(aType);
		}
		
		else if (aJourney.getSeating().queryAvailableFirstClassSeat(SeatType.Window)!= null) {
			aJourney.getSeating().queryAvailableFirstClassSeat(SeatType.Window).setReserved(true);;
			return aJourney.getSeating().queryAvailableFirstClassSeat(SeatType.Window);
		}
		else 
			return null;	}

}
