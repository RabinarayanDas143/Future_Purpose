package com.example.coreJava;

 
class Bicycle {
	public int gear;
	public int speed;
	

	public Bicycle() {
		super();
	}

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void bicycle(int gear, int speed, int Height) {
		int BikeGear = gear;
		int BikeSpeed = speed - 5;
		int seatheight = Height - 1;
		System.out.println("Hey, your Bicycle speed is :'" + BikeGear + "',Speed is : '" + BikeSpeed
				+ "' and Bike seat Height is :'" + seatheight + "'");
	}
}

class BicyclePrice{
	int price = 150000;
}
class Vechile extends BicyclePrice{
	String comfort = "Smooth";
}
public class Inheritance extends Bicycle {

	public Inheritance() {
		super();
	}

	public Inheritance(int gear, int speed) {
		super(gear, speed);
	}

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.bicycle(5, 100, 10);
		Vechile vechile = new Vechile();
		System.out.println("In vechile price is :'"+vechile.price+"' and it give good :'"+vechile.comfort+"'");
	}
}
