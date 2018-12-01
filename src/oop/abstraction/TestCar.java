package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
        car.start();
        car.stop();
        
        Toyota camry = new Toyota();
        camry.motorCar();
        camry.start();
        
        MotorCar hybridCar = new Toyota();
        hybridCar.fourWheelCar();
        
        BMW fiveSeries = new BMW();
        fiveSeries.start();
        fiveSeries.stop();
	}

}
