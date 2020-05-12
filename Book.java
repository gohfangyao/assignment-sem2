public abstract class Book //intended to be extended to create a full implementation
{
   //private because it cannot be directly accessed in other class
   private String title;
   private String author;
   private double price;
   private int qty;
  
   
   public Book(String title, String author, double price, int qty) //constructor method assigns values to the corresponding fields
   {
      this.title = title;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   
   public abstract void getTitle(); 
   public abstract void getAuthor();
   public abstract void getPrice();
   public abstract void getQty();
 
   
   public void print()
   {
      System.out.println("Book title    : "+ title);
      System.out.println("Book author   : "+ author);
      System.out.println("Book price    : "+ price);
      System.out.println("Book quantity : "+ qty);
      
   }
   
}
