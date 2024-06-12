package libraryItems;



//Written by: Mattis Wan-Bok-Nale (40274067)

//abstract class so that Item object cannot be created
public abstract class Item {
	
	//attributes
	//id is an int and each children class will add the respective letter in front of the id
	protected int id;
	protected String name;
	protected String author;
	protected int year;
	//lease id to keep track of which client has leased the item
	protected int lease;
	
	//default constructor
	public Item() {
		id =0;
		name ="";
		author="";
		year=0;
		lease = 0;
	}
	
	//parameterized constructor
	public Item(String name, String author, int year) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.lease = 0;
		
	}
	
	//copy constructor
	public Item(Item other) {
		this.name = other.name;
		this.author = other.author;
		this.year = other.year;
		
	}
	
	//accessor methods
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int getLease() {
		return lease;
	}
	
	//setters
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setLease(int lease) {
		this.lease = lease;
	}
	
	
	//overriding toString method
	@Override
	public String toString() {
		return "Name: " + name + "\nAuthor: "+ author + "\nYear of publication: "+year+ "\nID: "+id;
	}
	
	//overriding equals method
	@Override
	public boolean equals(Object other) {
		//check if parameter is not null
		if (other == null)
			return false;
		//check if class is the same
		if (this.getClass() != other.getClass())
			return false;
		
		//casting so that both object are from the same class
		Item otherItem = (Item) other;
		
		if (otherItem.name.equals(this.name) && otherItem.author.equals(this.author) && otherItem.year == this.year)
			return true;
		else 
			return false;
		
	}
	
	
	
	
	
	
	
	

}
