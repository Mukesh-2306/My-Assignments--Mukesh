package week4.day1;

public class JavaConnection extends MySqlConnection{
	
	public void connect() {
		System.out.println("connect from interface");
	}

	public void disconnect() {
		System.out.println("disconnect from interface");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate from interface");
		
	}
	 public void name() {
		 System.out.println("name method from Concrete class.");
		
	}
	
	 @Override
		public void executeQuery() {
		 System.out.println("executeQuery method from MySqlConnection abstract class.");
			
		}

	public static void main(String[] args) {
		JavaConnection obj =new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.name();
		obj.executeQuery();

	}

	

	

	

	

	

}
