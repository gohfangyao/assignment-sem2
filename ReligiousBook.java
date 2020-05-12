public class ReligiousBook extends Book //inherit from class Book.
{

	public ReligiousBook(String title, String author, double price, int qty) 
	{
		super(title, author, price, qty); //call superclass (Book class) constructor
	}
	
public void getTitle() //Overriding the superclass (Book class) method
{
	System.out.println("Book title : <<The God Delusion>>");
}

public void getAuthor()
{
	System.out.println("Book Author : Richard Dawkins");
}

public void getPrice()
{
	System.out.println("Book Price : RM300");
}

public void getQty()
{
	System.out.println("Book Quantity : 100");
}

public static void customer_base()
{
	System.out.println("Customer base : Religious school, University, church");
}	

public static void content()
{
	System.out.println("This book contains ten chapters.");
	System.out.println("This book is about God, religion and morality.");
}	

public static void translated()
{
	System.out.println("This book has been translated into 35 languages.");
	System.out.println("such as Spanish, German, Italian, and Turkish");
}	

public static void awards()
{
	System.out.println("This book nominated for Best Book at the British Book Awards.");
	System.out.println("Richard Dawkins was named Author of the Year 2006.");
	
}	

public void print() //Overriding the superclass (Book class) method
{
	System.out.println("Information of Religious Book");
	System.out.println("-------------------------------");
	super.print(); //call method print() in superclass (Book class)
}

}
