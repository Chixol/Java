package Test;

public class App {
    public static void main(String[] args) {
        // 객체 생성
        ManualCar manualCar = new ManualCar("10가1234", "blue", false, 0);
        AutomaticCar automaticCar = new AutomaticCar("10가1234", "blue", false);
        PassengerTrain passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
        FreightTrain freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);

        // 탈것 참조 변수에 저장
        Vehicle[] vehicles = {manualCar, automaticCar, passengerTrain, freightTrain};

        // 각 객체의 기능 호출 및 출력
        for (Vehicle vehicle : vehicles) {
            System.out.println("--------------------------------------");
            if (vehicle instanceof Car) {
                System.out.println("차량 정보:");
                System.out.println("차량 번호: " + ((Car) vehicle).getVin());
                System.out.println("색상: " + ((Car) vehicle).getColor());
                System.out.println("시동 상태: " + ((Car) vehicle).isStart());
            } else if (vehicle instanceof Train) {
                System.out.println("열차 정보:");
                System.out.println("열차 번호: " + ((Train) vehicle).getTrainNumber());
                System.out.println("출발역: " + ((Train) vehicle).getDepartureStation());
                System.out.println("도착역: " + ((Train) vehicle).getArrivalStation());
                System.out.println("시동 상태: " + ((Train) vehicle).isStart());
            }

            vehicle.accelerate();
            vehicle.stop();
            vehicle.setStart(false); // 시동 끄기
            if (vehicle instanceof ManualCar) {
                System.out.println("Gear: " + ((ManualCar) vehicle).getGear());
                ((ManualCar) vehicle).setGear(2); // 기어 변경
            } else if (vehicle instanceof PassengerTrain) {
                System.out.println("탑승객 수: " + ((PassengerTrain) vehicle).getPassengerCount());
            } else if (vehicle instanceof FreightTrain) {
                System.out.println("화물 무게: " + ((FreightTrain) vehicle).getCargoWeight());
            }
        }
    }
}