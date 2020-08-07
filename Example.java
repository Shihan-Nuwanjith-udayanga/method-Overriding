class Vehicle{
	public void park(int location){
		System.out.println("Vehicle Parking.. "+location);
	}
}
class Car extends Vehicle{
	public void park(int location){ //Method Overriding
		System.out.println("Car Parking.. "+location);
	}
}

class Example{
	public static void main(String args[]){
		Vehicle v1;
		v1=new Car();
		v1.park(1001); 
	}
}
