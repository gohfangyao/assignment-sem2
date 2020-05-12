public class MainBook 
{
    public static void main(String[]args)
    {
    	
    	EducationalBook b1 = new EducationalBook();
    	b1.print();
    	b1.getTitle();
    	b1.getAuthor();
    	b1.getPrice();
    	b1.getQty();
    	b1.customer_base();
    	b1.content();
    	b1.objective();
    	b1.language();
    	System.out.println();
    	
    	EntertainmentBook b2 = new EntertainmentBook();
    	b2.print();
    	b2.getTitle();
    	b2.getAuthor();
    	b2.getPrice();
    	b2.getQty();
    	b2.story_line();
    	b2.interested();
    	System.out.println();
    	
    	ReligiousBook b3 = new ReligiousBook();
    	b3.print();
    	b3.getTitle();
    	b3.getAuthor();
    	b3.getPrice();
    	b3.getQty();
    	b3.customer_base();
    	b3.content();
    	b3.translated();
    	b3.awards();
    	System.out.println();
    	
    }
	
}
