package libraryDriver;
import libraryItems.*;
import libraryClients.Client;
import java.util.Scanner;

//Written by: Mattis Wan-Bok-Nale (40274067)

public class Driver {

	public static void main(String[] args) {
		
		//welcome message
		System.out.println("Welcome to FunReadings library Mattis Wan-Bok-Nale.");
		System.out.print("Enter 1 if you want the menu and enter 2 if you want to run the hard-coded scenario: ");
		//Scanner to get input from user
		Scanner keyIn = new Scanner(System.in);
		int choice = keyIn.nextInt();
		int choice2;
		if (choice ==1) {
			
			//creating array for each item and clients
			Book[] myBooks = new Book[10];
			Journal[] myJournals = new Journal[10];
			Media[] myMedia = new Media[10];
			Client[] myClients = new Client[10];
			//making the menu
			do {
				System.out.println();
				System.out.println("1. Item menu (add, delete, change information, list)");
				System.out.println("2. Client menu(add client, edit client, delete client)");
				System.out.println("3. Lease an item to a client or return from a client.");
				System.out.println("4. Show all leased items by a client.");
				System.out.println("5. Show all leased items(by all clients)");
				System.out.println("6. Show all clients");
				System.out.println("7. Display the biggest book.");
				System.out.println("8. Make a copy of the books array.");
				System.out.println("9. Quit.");
				System.out.print("Enter number of action you want to make:");
				choice2 = keyIn.nextInt();
				switch (choice2) {
					case 1:
						System.out.println();
						System.out.println("1. Add an item.");
						System.out.println("2. Delete an item.");
						System.out.println("3. Change information of an item.");
						System.out.println("4. List all items in a specific category.");
						System.out.println("5. Print all items.");
						System.out.print("Enter number:");
						int choice3 = keyIn.nextInt();
						switch (choice3) {
							case 1:
								//asking what type of item is going to be created
								System.out.println("\n1. Book \n2. Journal \n3.Media");
								System.out.print("Enter number:");
								int choice4 = keyIn.nextInt();
								keyIn.nextLine();
								if (choice4 == 1) {
									//asking user for book info
									System.out.print("Enter the name: ");
									String name = keyIn.nextLine();
									System.out.print("Enter the author: ");
									String author = keyIn.nextLine();
									System.out.print("Enter year of publication and number of pages(seperated using space):");
									int year = keyIn.nextInt();
									int pages = keyIn.nextInt();
									//for loop to enter the book into the book array
									for (int i=0;i<10;i++) {
										if (myBooks[i] == null) {
											myBooks[i] = new Book(name,author,year,pages);
											break;
										}	
									}	
								}
								else if (choice4 == 2) {
									//asking user for book info
									System.out.print("Enter the name: ");
									String name = keyIn.nextLine();
									System.out.print("Enter the author: ");
									String author = keyIn.nextLine();
									System.out.print("Enter year of publication and volume number(seperated using space):");
									int year = keyIn.nextInt();
									int volume = keyIn.nextInt();
									for (int i=0;i<10;i++) {
										if (myJournals[i] == null) {
											myJournals[i] = new Journal(name,author,year,volume);
											break;
										}	
									}	
									
								}
								else {
									//asking user for book info
									System.out.print("Enter the name: ");
									String name = keyIn.nextLine();
									System.out.print("Enter the author: ");
									String author = keyIn.nextLine();
									System.out.print("Enter the type of media(audio, video or interactive): ");
									String type = keyIn.next();
									System.out.print("Enter the year of publication: ");
									int year = keyIn.nextInt();
									for (int i=0;i<10;i++) {
										if (myMedia[i] == null) {
											myMedia[i] = new Media(name,author,year,type);
											break;
										}	
									}		
								}
								break;
							case 2:
								System.out.println("\n1. Delete a Book \n2. Delete a Journal \n3. Delete a Media \nEnter number: ");
								int choice5 = keyIn.nextInt();
								if (choice5 == 1) {
									System.out.println("\nEnter Book ID you want to delete(only the number)");
									int deleteID = keyIn.nextInt();
									//looking for book id by going through book array
									for (int i =0;i<myBooks.length;i++) {
										if (myBooks[i].getId() == deleteID) {
											//deleting book by making it null
											myBooks[i]= null;
											break;
										}
									}
									
								}
								else if (choice5 == 2) {
									System.out.println("\nEnter Journal ID you want to delete(only the number)");
									int deleteID = keyIn.nextInt();
									//looking for Journal id by going through Journal array
									for (int i =0;i<myJournals.length;i++) {
										if (myJournals[i].getId() == deleteID) {
											//deleting Journal by making it null
											myJournals[i]= null;
											break;
										}
									}
									
								}
								else {
									System.out.println("\nEnter Media ID you want to delete(only the number)");
									int deleteID = keyIn.nextInt();
									//looking for book id by going through book array
									for (int i =0;i<myMedia.length;i++) {
										if (myMedia[i].getId() == deleteID) {
											//deleting book by making it null
											myMedia[i]= null;
											break;
										}
									}
								}
								break;
							case 3:
								//changing information of an item
								System.out.print("\n1. Book \n2. Journal \n3. Media \nChoose which item you want to change information: ");
								int choice6 = keyIn.nextInt();
								if (choice6 ==1) {
									System.out.print("\n1. Change name \n2. Change author \n3. Change year of publication \n4. Change number of pages \nEnter number: ");
									int choice7 = keyIn.nextInt();
									
									switch (choice7) {
									case 1:
										//changing the name
										System.out.print("\nEnter the book ID(only number) ");
										int bookId = keyIn.nextInt();
										keyIn.nextLine();
										System.out.print("Enter the new name: ");
										String name = keyIn.nextLine();
										//looking for the book in the book array
										for (int i =0;i<myBooks.length;i++) {
											if (myBooks[i].getId()==bookId) {
												//changing the name using setName
												myBooks[i].setName(name);
												break;
											}
										}
										break;
									case 2:
										//changing author
										System.out.print("\nEnter the book ID(only number) ");
										int bookId2 = keyIn.nextInt();
										keyIn.nextLine();
										System.out.print("Enter the new author: ");
										String author = keyIn.nextLine();
										//looking for the book in the book array
										for (int i =0;i<myBooks.length;i++) {
											if (myBooks[i].getId()==bookId2) {
												//changing the author
												myBooks[i].setAuthor(author);
												break;
											}
										}
										break;
									case 3:
										//changing year
										System.out.print("\nEnter the book ID(only number) ");
										int bookId3 = keyIn.nextInt();
										
										System.out.print("Enter the new year of publication: ");
										int year= keyIn.nextInt();
										//looking for the book in the book array
										for (int i =0;i<myBooks.length;i++) {
											if (myBooks[i].getId()==bookId3) {
												//changing the year
												myBooks[i].setYear(year);
												break;
											}
										}
										break;
									case 4:
										//changing pages
										System.out.print("\nEnter the book ID(only number) ");
										int bookId4 = keyIn.nextInt();
										
										System.out.print("Enter the new page number ");
										int pages= keyIn.nextInt();
										//looking for the book in the book array
										for (int i =0;i<myBooks.length;i++) {
											if (myBooks[i].getId()==bookId4) {
												//changing the pages
												myBooks[i].setPages(pages);
												break;
											}
										}
										break;
										
									}
								}
								else if (choice6 == 2) {
									System.out.print("\n1. Change name \n2. Change author \n3. Change year of publication \n4. Change volume number \nEnter number: ");
									int choice7 = keyIn.nextInt();
									
									switch (choice7) {
									case 1:
										//changing the name
										System.out.print("\nEnter the Journal ID(only number) ");
										int journalId = keyIn.nextInt();
										keyIn.nextLine();
										System.out.print("Enter the new name: ");
										String name = keyIn.nextLine();
										//looking for journal
										for (int i =0;i<myJournals.length;i++) {
											if (myJournals[i].getId()==journalId) {
												//changing the name using setName
												myJournals[i].setName(name);
												break;
											}
										}
										break;
									case 2:
										//changing author
										System.out.print("\nEnter the Journal ID(only number) ");
										int journalId2 = keyIn.nextInt();
										keyIn.nextLine();
										System.out.print("Enter the new author: ");
										String author = keyIn.nextLine();
										//looking for the journal in array
										for (int i =0;i<myJournals.length;i++) {
											if (myJournals[i].getId()==journalId2) {
												//changing the author
												myJournals[i].setAuthor(author);
												break;
											}
										}
										break;
									case 3:
										//changing year
										System.out.print("\nEnter the Journal ID(only number) ");
										int journalId3 = keyIn.nextInt();
										
										System.out.print("Enter the new year of publication: ");
										int year= keyIn.nextInt();
										//looking for the journal in array
										for (int i =0;i<myJournals.length;i++) {
											if (myJournals[i].getId()==journalId3) {
												//changing the year
												myJournals[i].setYear(year);
												break;
											}
										}
										break;
									case 4:
										//changing volume number
										System.out.print("\nEnter the Journal ID(only number) ");
										int journalId4 = keyIn.nextInt();
										
										System.out.print("Enter the new volume number ");
										int volume= keyIn.nextInt();
										//looking for the journal
										for (int i =0;i<myJournals.length;i++) {
											if (myJournals[i].getId()==journalId4) {
												//changing the volume
												myJournals[i].setVolume(volume);
												break;
											}
										}
										break;
										
									}
									
								}
								else {
									//for media
									System.out.print("\n1. Change name \n2. Change author \n3. Change year of publication \n4. Change type of media \nEnter number: ");
									int choice7 = keyIn.nextInt();
									
									switch (choice7) {
									case 1:
										//changing the name
										System.out.print("\nEnter the Media ID(only number) ");
										int id = keyIn.nextInt();
										keyIn.nextLine();
										System.out.print("Enter the new name: ");
										String name = keyIn.nextLine();
										//looking for media
										for (int i =0;i<myMedia.length;i++) {
											if (myMedia[i].getId()==id) {
												//changing the name using setName
												myMedia[i].setName(name);
												break;
											}
										}
										break;
									case 2:
										//changing author
										System.out.print("\nEnter the Media ID(only number) ");
										int id2 = keyIn.nextInt();
										keyIn.nextLine();
										System.out.print("Enter the new author: ");
										String author = keyIn.nextLine();
										//looking for the media in array
										for (int i =0;i<myMedia.length;i++) {
											if (myMedia[i].getId()==id2) {
												//changing the author
												myMedia[i].setAuthor(author);
												break;
											}
										}
										break;
									case 3:
										//changing year
										System.out.print("\nEnter the Media ID(only number) ");
										int id3 = keyIn.nextInt();
										
										System.out.print("Enter the new year of publication: ");
										int year= keyIn.nextInt();
										//looking for the media in array
										for (int i =0;i<myMedia.length;i++) {
											if (myMedia[i].getId()==id3) {
												//changing the year
												myMedia[i].setYear(year);
												break;
											}
										}
										break;
									case 4:
										//changing type
										System.out.print("\nEnter the Media ID(only number) ");
										int id4 = keyIn.nextInt();
										
										System.out.print("Enter the new type(audio,video or interactive): ");
										
										String type = keyIn.next();
										//looking for the media
										for (int i =0;i<myMedia.length;i++) {
											if (myMedia[i].getId()==id4) {
												//changing the type
												myMedia[i].setType(type);
												break;
											}
										}
										break;
										
									}
									
									
								}
								break;
							case 4:
								//listing all items in a category
								System.out.print("\n1. List all Books \n2. List all Journals \n3. List all Media \nEnter number: ");
								int choice7= keyIn.nextInt();
								if (choice7 == 1) {
									for (int i=0;i<myBooks.length;i++) {
										if (myBooks[i] != null)
											System.out.println(myBooks[i] +"\n");
										
									}
								}
								else if (choice7 ==2) {
									for (int i=0;i<myJournals.length;i++) {
										if (myJournals[i] != null)
											System.out.println(myJournals[i]+ "\n");
									}
									
								}
								else {
									for (int i=0;i<myMedia.length;i++) {
										if (myMedia[i] != null)
											System.out.println(myMedia[i] +"\n");
									}
								}
								break;
							case 5:
								
								//listing all items
								System.out.println();
								for (int i=0;i<myBooks.length;i++) {
									if (myBooks[i] != null)
										System.out.println(myBooks[i] +"\n");
								}
								for (int i=0;i<myJournals.length;i++) {
									if (myJournals[i] != null)
										System.out.println(myJournals[i]+ "\n");
								}
								
								for (int i=0;i<myMedia.length;i++) {
									if (myMedia[i] != null)
										System.out.println(myMedia[i]+ "\n");
								}
								break;
								
								
									
						}
						break;
					case 2:
						//client menu, asking for user input
						System.out.println("\n1. Add client \n2. Delete client \n3. Edit client \nEnter number: ");
						int choice5 = keyIn.nextInt();
						keyIn.nextLine();
						if (choice5 == 1) {
							System.out.print("\nEnter name of client: ");
							String clientName = keyIn.nextLine();
							System.out.print("Enter phone number: ");
							long phone = keyIn.nextLong();
							keyIn.nextLine();
							System.out.print("Enter email: ");
							String email = keyIn.nextLine();
							//inserting client into client array
							for (int i =0;i<myClients.length;i++) {
								if (myClients[i] == null) {
									myClients[i] = new Client(clientName,phone,email);
									System.out.println(myClients[i]);
									break;
								}	
							}
							
						}
						else if (choice5 ==2) {
							System.out.print("Enter client ID you want to delete: ");
							int deleteId = keyIn.nextInt();
							//looking for client id in client array
							for (int i = 0;i<myClients.length;i++) {
								if (myClients[i].getId() == deleteId) {
									myClients[i] = null;
									break;
								}
							}
						}
						else {
							System.out.print("Enter the id of the client you want ot edit: ");
							int editId = keyIn.nextInt();
							//looking for client in client array
							for (int i =0;i<myClients.length;i++) {
								if (myClients[i]!= null) {
									if (myClients[i].getId() == editId) {
										System.out.print("1. Change name \n2. Change phone number \n3. Change Email \nEnter number: ");
										int editChoice = keyIn.nextInt();
										keyIn.nextLine();
										if (editChoice == 1) {
											System.out.print("Enter new name: ");
											String newName = keyIn.nextLine();
											myClients[i].setName(newName);
										}
										else if(editChoice ==2) {
											System.out.print("Enter new phone number: ");
											long newPhone = keyIn.nextLong();	
											myClients[i].setPhone(newPhone);
										}
										else {
											System.out.print("Enter new email: ");
											String newEmail = keyIn.next();
											myClients[i].setEmail(newEmail);
										}
									}
								}
							}
						}
						break;
					case 3:
						System.out.print("\n1. Lease an item \n2. Return an item \nEnter number: ");
						int choice7 = keyIn.nextInt();	
						if (choice7 ==1) {
							System.out.print("\nEnter the item ID(for instance:B 12): ");
							String letter = keyIn.next();
							int number = keyIn.nextInt();
							if (letter.equals("B")) {
								for (int i =0;i<myBooks.length;i++) {
									if (myBooks[i] != null) {
										if (myBooks[i].getId() == number) {
											System.out.print("Enter the id of the client leasing the item: ");
											int lease = keyIn.nextInt();
											myBooks[i].setLease(lease);
										}
									}
								}
							}
							else if (letter.equals("J")) {
								for (int i =0;i<myJournals.length;i++) {
									if (myJournals[i]!= null) {
										if (myJournals[i].getId() == number) {
											System.out.print("Enter the id of the client leasing the item: ");
											int lease = keyIn.nextInt();
											myJournals[i].setLease(lease);
										}
									}
								}
							}
							else {
								for (int i =0;i<myMedia.length;i++) {
									if (myMedia[i] != null) {
										if (myMedia[i].getId() == number) {
											System.out.print("Enter the id of the client leasing the item: ");
											int lease = keyIn.nextInt();
											myMedia[i].setLease(lease);
										}
									}
								}
								
							}
						}
						else {
							System.out.print("\nEnter the item ID being returned(for instance: B 12): ");
							String letter = keyIn.next();
							int number = keyIn.nextInt();
							if (letter.equals("B")) {
								for (int i =0;i<myBooks.length;i++) {
									if (myBooks[i]!= null) {
										if (myBooks[i].getId() == number) {
											myBooks[i].setLease(0);
										}
									}
								}
							}
							else if (letter.equals("J")) {
								for (int i =0;i<myJournals.length;i++) {
									if (myJournals[i] != null) {
										if (myJournals[i].getId() == number) {
											myJournals[i].setLease(0);
										}
									}
								}
							}
							else {
								for (int i =0;i<myMedia.length;i++) {
									if (myMedia[i] != null) {
										if (myMedia[i].getId() == number) {
											myMedia[i].setLease(0);
										}
									}
								}
								
							}
						
							
						}
						break;
					case 4:
						//showing all leased items by a client
						System.out.print("\nEnter the client ID: ");
						int id = keyIn.nextInt();
						//finding all the items that the client leased by going through each array
						for (int i=0;i<myBooks.length;i++) {
							if (myBooks[i] != null) {
								if (myBooks[i].getLease()== id) {
									System.out.println(myBooks[i]);
									System.out.println();
									
								}
							}
						}
						for (int i=0;i<myJournals.length;i++) {
							if (myJournals[i] != null) {
								if (myJournals[i].getLease()== id) {
									System.out.println(myJournals[i]);
									System.out.println();
									
								}
							}
						}
						for (int i=0;i<myMedia.length;i++) {
							if (myMedia[i]!= null) {
								if (myMedia[i].getLease()== id) {
									System.out.println(myMedia[i]);
									System.out.println();
									
								}
							}
						}
						break;
					case 5:
						//if lease != 0 then the item is leased
						//going through every item array to check lease
						for (int i=0;i<myBooks.length;i++) {
							if (myBooks[i]!= null) {
								if (myBooks[i].getLease()!=0) {
									System.out.println(myBooks[i]);
									System.out.println();
									
								}
							}
						}
						for (int i=0;i<myJournals.length;i++) {
							if (myJournals[i] != null) {
								if (myJournals[i].getLease()!=0) {
									System.out.println(myJournals[i]);
									System.out.println();
									
								}
							}
						}
						for (int i=0;i<myMedia.length;i++) {
							if (myMedia[i]!= null) {
								if (myMedia[i].getLease()!=0) {
									System.out.println(myMedia[i]);
									System.out.println();
									
								}
							}
						}
						break;
					case 6:
						//showing all clients
						for (int i=0;i<myClients.length;i++) {
							if (myClients[i] != null) {
								System.out.println(myClients[i]);
								System.out.println();
							}
						}
						break;
					case 7:
						//displaying the biggest book
						System.out.println("\nThe biggest book is: \n"+ getBiggestBook(myBooks));
						break;
					case 8:
						//making a copy of books array
						copyBooks(myBooks);
						
						
							
						
						
						
				}
			} while (choice2 != 9);
			//closing message to end program
			System.out.println("Goodbye!");
			
		/////////////////////////////////////////////////////	
		}
		else if (choice == 2) {
			//creating the 3 of each objects
			Item[] myItems = new Item[10];
			myItems[0]= new Book("Jungle Book","George lucas", 2018,234);
			myItems[1]= new Book("Jungle Book","George lucas", 2018,234);
			myItems[2]= new Book("star wars","Tom holland", 2003,902);
			myItems[3]= new Journal("times","Thomas villeneuve", 2009,3);
			myItems[4]= new Journal("times","Thomas villeneuve", 2009,3);
			myItems[5]= new Journal("Sun","Messi", 2018,43);
			myItems[6]= new Media("Somebody Else","The 1975", 2010,"Audio");
			myItems[7]= new Media("Somebody Else","The 1975", 2010,"Audio");
			myItems[8]= new Media("The Zoo","MrBeast", 2009,"Video");
			
			//creating 3 clients
		    Client[] myClients = new Client[3];
			myClients[0] = new Client("mattis",4383659028L,"wan.mattis@gmail.com");
			myClients[1] = new Client("mattis",4383659028L,"wan.mattis@gmail.com");
			myClients[2] = new Client("Andy",8902378965L,"andy@gmail.com");
			
			//displaying the information of each item and client
			System.out.println();
			System.out.println("------ITEMS------");
			for (int i=0;i<myItems.length;i++) {
				if (myItems[i] != null) {
					System.out.println(myItems[i]);
					System.out.println();
				}
			}
			
			System.out.println("------CLIENTS------");
			for (int i=0;i<myClients.length;i++) {
				if (myClients != null) {
					System.out.println(myClients[i]);
					System.out.println();
				}
			}
			
			//testing the equality using equals method
			System.out.println("-----Equality testing-----");
			if (myItems[0].equals(myItems[1])) {
				System.out.println("Book ID B" +myItems[0].getId()+" is equal to Book ID B"+ myItems[1].getId());
			}
			else
				System.out.println("not equal");
			
			//testing two objects from different classes
			if (myItems[2].equals(myItems[5])) {
				System.out.println("B2 is equal to J3");
			}
			else
				System.out.println("B2 is not equal to J3");
			
			//testing two objects from same class but different values
			if (myItems[0].equals(myItems[2]))
				System.out.println("B1 is equal to B3");
			else
				System.out.println("B1 is not equal to B3");
			
			//putting the items in different arrays
			Book[] myBooks = new Book[5];
			myBooks[0] = (Book) myItems[0];
			myBooks[1] = (Book) myItems[1];
			myBooks[2] = (Book) myItems[2];
			Journal[] myJournals = new Journal[5];
			myJournals[0] = (Journal) myItems[3];
			myJournals[1] = (Journal) myItems[4];
			myJournals[2] = (Journal) myItems[5];
			Media[] myMedia = new Media[5];
			myMedia[0] = (Media) myItems[6];
			myMedia[1] = (Media) myItems[7];
			myMedia[2] = (Media) myItems[8];
			
			//calling getBiggestBook method on myBooks
			System.out.println();
			System.out.println("------The biggest book in the book array-------");
			System.out.println(getBiggestBook(myBooks));
			
			
			//calling copyBooks method on Media array
		    //copyBooks(myMedia); makes an error
			System.out.println();
			System.out.println("copyBooks() cannot take an array of Media as parameter, instead it can only take an array of Books.");
			
			
			
			
		}
		//closing scanner
		keyIn.close();
		
		
		
		
	
		
	}
		

	
	//getBiggestBook method
	public static Book getBiggestBook(Item[] myItems) {
		Book biggestBook = null;
		int mostPages=0;
		for (int i=0;i<myItems.length;i++) {
			//checking if the item is a book and not null
			if (myItems[i] != null && myItems[i] instanceof Book) {
				//casting to Book so that i can use method getPages
				Book book = (Book) myItems[i];
				//checking if book has more pages 
				if (book.getPages() > mostPages) {
					biggestBook = book;
					//updating most pages number
					mostPages = book.getPages();
				}
			}
			
		}
		return biggestBook;
		
		
	}
	
	//copyBooks method
	public static Book[] copyBooks(Book[] myBooks) {
		//creating a new array
		Book[] newBooks = new Book[myBooks.length];
		
		for (int i =0;i<newBooks.length;i++) {
			//checking if myBooks is null
			if (myBooks[i] !=null) {
				//copying using the copy constructor
				newBooks[i] = new Book(myBooks[i]);
			}
		}
		return newBooks;
	}
	


}
