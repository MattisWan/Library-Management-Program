package libraryItems;


//Written by: Mattis Wan-Bok-Nale (40274067)
public class Media extends Item{
	//additional attributes
	private String type;
	//count which will be used to set the ID of the journals
	private static int count =1;
		
	//default constructor
	public Media() {
		super();
		type ="";
	}
		
	//parameterized constructor
	public Media(String name, String author, int year, String type) {
		super(name,author,year);
		this.type = type;
		this.id = count;
		count +=1;
	}
	
	//copy constructor
	public Media(Media other) {
		super(other);
		this.type = other.type;
		this.id = count;
		count+=1;
	}
	
	//getters
	public String getType() {
		return type;
		
	}
	
	//setters
	
	public void setType(String type) {
		this.type = type;
	}
	
	//toString method
	
	@Override
	public String toString() {
		return "Media name: " + name + "\nAuthor: "+ author + "\nYear of publication: "+year+ "\nID: M"+id + "\nType: "+type+"\nLeased to Client ID(If 0 then not leased): "+ lease;
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
			Media otherItem = (Media) other;
			
			if (otherItem.name.equals(this.name) && otherItem.author.equals(this.author) && otherItem.year == this.year && otherItem.type.equals(this.type))
				return true;
			else 
				return false;
	}
			


}
