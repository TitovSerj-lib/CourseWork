package sample;

public class Train {
    private String destination;
    private int numberTrain;
    private int departureTime;
    private int numberOfSeatsCommon;
    private int numberOfSeatsCompartment;
    private int numberOfSeatsSeatpost;
    private int numberOfSeatsSuite;

    public Train(String destination, int numberTrain, int departureTime, int numberOfSeatsCommon, int numberOfSeatsCompartment, int numberOfSeatsSeatpost, int numberOfSeatsSuite) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
        this.numberOfSeatsCommon = numberOfSeatsCommon;
        this.numberOfSeatsCompartment = numberOfSeatsCompartment;
        this.numberOfSeatsSeatpost = numberOfSeatsSeatpost;
        this.numberOfSeatsSuite = numberOfSeatsSuite;
    }
    public Train()
    {
        destination = "";
        numberTrain = 0;
        departureTime = 0;
        numberOfSeatsCommon = 0;
        numberOfSeatsCompartment = 0;
        numberOfSeatsSeatpost = 0;
        numberOfSeatsSuite = 0;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfSeatsCommon() {
        return numberOfSeatsCommon;
    }

    public void setNumberOfSeatsCommon(int numberOfSeatsCommon) {
        this.numberOfSeatsCommon = numberOfSeatsCommon;
    }

    public int getNumberOfSeatsCompartment() {
        return numberOfSeatsCompartment;
    }

    public void setNumberOfSeatsCompartment(int numberOfSeatsCompartment) {
        this.numberOfSeatsCompartment = numberOfSeatsCompartment;
    }

    public int getNumberOfSeatsSeatpost() {
        return numberOfSeatsSeatpost;
    }

    public void setNumberOfSeatsSeatpost(int numberOfSeatsSeatpost) {
        this.numberOfSeatsSeatpost = numberOfSeatsSeatpost;
    }

    public int getNumberOfSeatsSuite() {
        return numberOfSeatsSuite;
    }

    public void setNumberOfSeatsSuite(int numberOfSeatsSuite) {
        this.numberOfSeatsSuite = numberOfSeatsSuite;
    }

    @Override
    public String toString() {
        return  "Пункт призначення = '" + destination + '\'' +
                ", номер поїзду = " + numberTrain +
                ", час відправки = " + departureTime +
                ", загальних місць = " + numberOfSeatsCommon +
                ", купе = " + numberOfSeatsCompartment +
                ", плацкарт = " + numberOfSeatsSeatpost +
                ", люкс = " + numberOfSeatsSuite + "\n";
    }

}
