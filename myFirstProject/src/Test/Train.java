package Test;

public class Train implements Vehicle {

	private String trainNumber;
	private String departureStation;
	private String arrivalStation;
	private boolean isStart;
	
	public Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
		this.trainNumber = trainNumber;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.isStart = isStart;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public boolean isStart() {
        return isStart;
    }

    @Override
    public void accelerate() {
        System.out.println("열차가 천천히 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("열차가 천천히 정차합니다!");
    }

    @Override
    public void setStart(boolean start) {
        this.isStart = start;
    }
	

}
