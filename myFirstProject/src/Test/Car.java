package Test;

public class Car implements Vehicle {
	private String vin;
	private String color;
	private boolean isStart;
	
	public Car(String vin, String color, boolean isStart) {
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
	}
	
	public String getVin() {
		return vin;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isStart() {
		return isStart;
	}
	
	@Override
    public void accelerate() {
        System.out.println("자동차가 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 정차합니다!");
    }

    @Override
    public void setStart(boolean start) {
        this.isStart = start;
    }
}
