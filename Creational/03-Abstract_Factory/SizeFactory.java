public class SizeFactory extends aFactory {
	
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   Size getSize(String size) {
   
      if(size == null){
         return null;
      }		
      
      if(size.equalsIgnoreCase("LARGE")){
         return new Large();
         
      }else if(size.equalsIgnoreCase("MEDIUM")){
         return new Medium();
         
      }else if(size.equalsIgnoreCase("SMALL")){
         return new Small();
      }
      
      return null;
   }
}
