class Car implements Cloneable {
	private String carType;
	private String model;
	public Car() {
		carType = "Standard";
		model = "Nano";
	}

	//Here is heart of prototype design pattern..
	public Car clone() {
		return new Car();
	}

	public void makeAdvanced() {
		carType = "Advanced";
		model = "Maruti";	
	}
	public String getModel(){
		return model;
	}
}

