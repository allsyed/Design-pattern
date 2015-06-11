public class aFactoryPattern {
	public static void main(String[] args) {

		//get shape factory
		aFactory shapeFactory = Factory.getFactory("SHAPE");

		//get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Shape Circle
		shape1.draw();

		//get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//call draw method of Shape Rectangle
		shape2.draw();

		//get an object of Shape Square 
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//call draw method of Shape Square
		shape3.draw();
		Shape shape4 = shapeFactory.getShape("PENTAGON");

		//call draw method of Shape Square
		shape4.draw();


		//get size factory
		aFactory sizeFactory = Factory.getFactory("SIZE");

		//get an object of Size LARGE
		Size size1 = sizeFactory.getSize("LARGE");

		//call Dimension method of LARGE
		size1.Dimension();

		//get an object of Size MEDIUM
		Size size2 = sizeFactory.getSize("MEDIUM");

		//call Dimension method of MEDIUM
		size2.Dimension();

		//get an object of Size Small
		Size size3 = sizeFactory.getSize("SMALL");

		//call Dimension method of Size Small
		size3.Dimension();
	}
}
