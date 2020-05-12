public class EducationalBook extends Book //inherit from class Book.
{

	public EducationalBook(String title, String author, double price, int qty) 
	{
		super(title, author, price, qty); //call superclass (Book class) constructor
	}
	
public void getTitle() //Overriding the superclass (Book class) method
{
	System.out.println("Book title : <<English Proficiency>>");
}

public void getAuthor()
{
	System.out.println("Book Author : Watson Andaya");	
}

public void getPrice()
{
	System.out.println("Book Price : RM50");
}

public void getQty()
{
	System.out.println("Book Quantity : 500");
}

public static void customer_base()
{
	System.out.println("Customer base : school, college, university");
	
}	

public static void content()
{
	System.out.println("well-organized subject contents, have end-of-chapter exercises");
}	
	
public static void objective()
{
	System.out.println("to help students learn how to learn, cultivate positive values , and a commitment to life-long learning.");
}		
	
public static void language()
{
	System.out.println("The language is accurate and precise.");
}		

public void print() //Overriding the superclass (Book class) method
{
	System.out.println("Information of Educational Book");
	System.out.println("-------------------------------");
	super.print(); //call method print() in superclass (Book class)
}

}

