//the concerete builder class
class PenBuilderConc implements PenBuilder{

	private Pen pen;

	public PenBuilderConc() {

		this.pen = new Pen();

	}

	public void buildPenCap() {

		pen.setPenCap("plastic Cap");

	}

	public void buildPenBody() {

		pen.setPenBody("fibre Body");

	}
	public Pen getPen(){
		return this.pen;
	}	

}
