public class Demo {
	public Car makeMaruti(Car basicCar) {
		basicCar.makeAdvanced();
		return basicCar;
	}
	public static void main(String args[]){
		Car car = new Car();
		Car basicCar = car.clone();
		Demo demo = new Demo();
		Car advancedCar = demo.makeMaruti(basicCar);
		System.out.println("Using Prototype Design Pattern here to create prototype object for existing object :\n\n "+advancedCar.getModel());
	}
}
