public class Demo {
	
	public static void main(String[] args){
		
		
		PenBuilder oldStylePen = new PenBuilderConc();
		
		
		PenMaker penMaker = new PenMaker(oldStylePen);
		
		penMaker.makePen();
		
		Pen firstPen = penMaker.getPen();
		
		System.out.println("Pen Built");
		
		System.out.println("Pen Cap Type: " + firstPen.getPenCap());
		
		System.out.println("Pen Body Type: " + firstPen.getPenBody());
		
		
	}
	
}
