
public class TrainSeatBookingApplication {

	public static void main(String [] args) {
		Seat S;
		TrainOperator Operator = new TrainSmart("John");
		TrainJourney Journey1 = new TrainJourney("1","Melbourne","Sydney","10:00",new PetiteFloorGrid());
		S=Operator.reserveEconomy(Journey1,SeatType.AISLE);
		System.out.println(S);
		System.out.println(Operator.toString());
		System.out.println(Journey1.toString());
	}
}
