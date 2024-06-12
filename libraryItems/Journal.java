package libraryItems;


//Written by: Mattis Wan-Bok-Nale (40274067)
public class Journal extends Item{
	
	//additional attributes
	private int volume;
	//count which will be used to set the ID of the journals
	private static int count =1;
	
	//default constructor
	public Journal() {
		super();
		volume =0;
	}
	
	//parameterized constructor
	public Journal(String name, String author, int year, int volume) {
		super(name,author,year);
		this.volume = volume;
		this.id = count;
		count +=1;
	}
	
	//copy constructor
	public Journal(Journal other) {
		super(other);
		this.volume = other.volume;
		this.id = count;
		count+=1;
	}
	
	//getters
	public int getVolume() {
		return volume;
		
	}
	
	//setters
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//toString method
	
	@Override
	public String toString() {
		return "Journal name: " + name + "\nAuthor: "+ author + "\nYear of publication: "+year+ "\nID: J"+id + "\nVolume number: "+ volume +"\nLeased to Client ID(If 0 then not leased): "+ lease;
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
		Journal otherItem = (Journal) other;
		
		if (otherItem.name.equals(this.name) && otherItem.author.equals(this.author) && otherItem.year == this.year && otherItem.volume == this.volume)
			return true;
		else 
			return false;
	}
		
	
	


}
