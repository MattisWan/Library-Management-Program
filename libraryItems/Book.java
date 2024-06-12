package libraryItems;


//Written by: Mattis Wan-Bok-Nale (40274067)
public class Book extends Item{
	
	
	//additional attributes
	private int pages;
	//count which will be used to set the ID of the journals, set to static so that it can be used to increment
	private static int count =1;
		
	//default constructor
	public Book() {
		super();
		pages =0;
	}
		
	//parameterized constructor
	public Book(String name, String author, int year, int pages) {
		super(name,author,year);
		this.pages = pages;
		this.id = count;
		count++;
	}
	
	//copy constructor
	public Book(Book other) {
		super(other);
		this.pages = other.pages;
		this.id = count;
		count++;
	}
	
	//getters
	public int getPages() {
		return pages;
		
	}
	
	//setters
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	//toString method
	
	@Override
	public String toString() {
		return "Book name: " + name + "\nAuthor: "+ author + "\nYear of publication: "+year+ "\nID: B"+id + "\nPage number: "+ pages+"\nLeased to Client ID(If 0 then not leased): "+ lease;
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
			Book otherItem = (Book) other;
			
			if (otherItem.name.equals(this.name) && otherItem.author.equals(this.author) && otherItem.year == this.year && otherItem.pages == this.pages)
				return true;
			else 
				return false;
	}
			

}
