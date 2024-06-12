package libraryClients;



//Written by: Mattis Wan-Bok-Nale (40274067)
public class Client {
	
	//attributes
	//set count to 1 and increment after the creation of each client object
	private int id;
	private long phone;
	private String name;
	private String email;
	private static int count=1;
	
	//default constructor
	public Client() {
		id=0;
		phone=0;
		name="";
		email="";
		
		
	}
	
	//parameterized constructor
	public Client(String name, long phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.id = count;
		count+=1;
				
	}
	
	//copy constructor
	public Client(Client other) {
		this.name = other.name;
		this.phone = other.phone;
		this.email = other.email;
		id = count;
		count+=1;
	}
	
	//getters
	public int getId() {
		return id;
		
	}
	
	
	public long getPhone() {
		return phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	//setters
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Client ID: "+ id+"\nName: "+name+"\nPhone number: "+phone+ "\nEmail: "+email;
	}
	
	//equals method
	@Override
	public boolean equals(Object other) {
		//check if parameter is not null
		if (other == null)
			return false;
		//check if class is the same
		if (this.getClass() != other.getClass())
			return false;
		
		//casting so that both object are from the same class
			Client otherClient = (Client) other;
			
			if (otherClient.name.equals(this.name) && otherClient.phone == this.phone && otherClient.email.equals(this.email) )
				return true;
			else 
				return false;
	}

}
