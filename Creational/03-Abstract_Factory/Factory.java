public class Factory {
   public static aFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
         
      }else if(choice.equalsIgnoreCase("SIZE")){
         return new SizeFactory();
      }
      
      return null;
   }
}
