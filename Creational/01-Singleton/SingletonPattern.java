class SingletonPattern{
       public static void main(String[] args) {

      //calling the below constructor will give a compile time error
      //Compile Time Error: The constructor SingleObject() is not visible
      //Singleton object = new Singleton();

      //Get the only object available
      Singleton object = Singleton.getInstance();

      //show the message
      object.showMessage();
   }
}	
