public class EntertainmentBook extends Book //inherit from the class Book.
{

	public EntertainmentBook(String title, String author, double price, int qty) {
		super(title, author, price, qty);
		
	}
	public void getTitle() //Overriding the superclass (Book class) method
	{
		System.out.println("Book title : <<Journey to Juno>>");
	}
	
	public void getAuthor()
	{
		System.out.println("Book Author : Galaxy Zach");
	}

	public void getPrice()
	{
		System.out.println("Book Price : RM130");	
	}
	
	public void getQty()
	{
		System.out.println("Book Quantity : 200");
	}
	
	public static void story_line()
	{
		System.out.println("This book have a hook, desire, conflict, challange, climax and resolution. ");	
	}	
	
	public static void interested()
	{
		System.out.println("This book is interested by children.");
	}	
	
	public void print() //Overriding the superclass (Book class) method
	{
		System.out.println("Information of Entertainment Book");
		System.out.println("-------------------------------");
		super.print(); //call method print() in superclass (Book class)
	}
	
}
