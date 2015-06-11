public class PenMaker {
	
	private PenBuilder penBuilder;
	
	
	public PenMaker(PenBuilder penBuilder){
		
		this.penBuilder = penBuilder;
		
	}
	
	
	public Pen getPen(){
		
		return this.penBuilder.getPen();
		
	}
	
	public void makePen() {
		
		this.penBuilder.buildPenCap();
		this.penBuilder.buildPenBody();
		
	}
	
}
