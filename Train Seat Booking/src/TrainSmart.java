
public class TrainSmart extends TrainOperator {
	/**
	 * Default constructor 
	 * @param ON: Operator Name
	 */
	public TrainSmart(String ON) {
		super(ON);
	}
	/**
	 * reserveFirstClass reserves a first class seat according to TrainSmart rules
	 */
	@Override
	public Seat reserveFirstClass(TrainJourney aJourney, SeatType aType) {
		if (aJourney.getSeating().queryAvailableFirstClassSeat(aType)!= null) {
			aJourney.getSeating().queryAvailableFirstClassSeat(aType).setReserved(true);
			return aJourney.getSeating().queryAvailableFirstClassSeat(aType);
		}
		else if(aJourney.getSeating().queryAvailableEconomySeat(SeatType.AISLE)!= null) { 
			aJourney.getSeating().queryAvailableEconomySeat(SeatType.AISLE).setReserved(true);
			aJourney.getSeating().getRight(aJourney.getSeating().queryAvailableEconomySeat(SeatType.AISLE)).setReserved(true);
			return aJourney.getSeating().queryAvailableEconomySeat(SeatType.AISLE);
		}
		else if(aJourney.getSeating().queryAvailableEconomySeat(SeatType.Window)!= null) {
			aJourney.getSeating().queryAvailableEconomySeat(SeatType.AISLE).setReserved(true);
			aJourney.getSeating().getRight(aJourney.getSeating().queryAvailableEconomySeat(SeatType.Window)).setReserved(true);
			return aJourney.getSeating().queryAvailableEconomySeat(SeatType.Window);
		}
		return null;
	}
	/**
	 * reserveEconomyClass reserves a Economy class seat according to TrainSmart rules
	 */
	@Override
	public Seat reserveEconomy(TrainJourney aJourney, SeatType aType) {
		if (aJourney.getSeating().queryAvailableEconomySeat(aType)!= null) {
			aJourney.getSeating().queryAvailableEconomySeat(aType).setReserved(true);
			return aJourney.getSeating().queryAvailableEconomySeat(aType);
		}
		return null;
	}

}
