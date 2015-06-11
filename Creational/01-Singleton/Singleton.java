public class Singleton{
	//making constructor private so that no one else can access it.. except class methods.
       	private  static Singleton instance = new Singleton(); 
	private  Singleton(){}

	public static Singleton getInstance(){
		return instance;
	}

	public void showMessage(){
      System.out.println("Hello World! \n This is one and only instance for this object");
   }
}

	

