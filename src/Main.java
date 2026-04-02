public class Main {

	public static void main(String[] args) {
		VehicleFactory bikeFactory = new BikeFactory();
		VehicleFactory truckFactory = new TruckFactory();
		VehicleFactory carFactory = new CarFactory();
		
		Client c1 = new Client(bikeFactory);
		Client c2 = new Client(truckFactory);
		Client c3 = new Client(carFactory);
		
		
		Vehicle bike = c1.getVehicle();
		bike.printVehicle();
		Vehicle car = c3.getVehicle();
		car.printVehicle();
		Vehicle truck = c2.getVehicle();
		truck.printVehicle();
	}
}

abstract class Vehicle{
	public abstract void printVehicle();
}

class Bike extends Vehicle{
	public void printVehicle() {
		System.out.println("I am a bike");
	}
}

class Car extends Vehicle{
	public void printVehicle() {
		System.out.println("I am a car");
	}
}

class Truck extends Vehicle{
	public void printVehicle() {
		System.out.println("I am a truck");
	}
}

interface VehicleFactory{
	Vehicle createVehicle();
}

class BikeFactory implements VehicleFactory{
	public Vehicle createVehicle() {
		return new Bike();
	}
}

class CarFactory implements VehicleFactory{
	public Vehicle createVehicle() {
		return new Car();
	}
}

class TruckFactory implements VehicleFactory{
	public Vehicle createVehicle() {
		return new Truck();
	}
}

class Client{
	private Vehicle v;
	
	public Client(VehicleFactory factory) {
		v = factory.createVehicle();
	}
	
	public Vehicle getVehicle() {return v;}
}