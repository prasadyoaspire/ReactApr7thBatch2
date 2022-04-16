
class Book {

   private int bookId;
   private String bookName;
   private double price;
   private Author author;

   Book(int bookId,String bookName,double price,Author author) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.price = price;
    this.author = author;
   }
   public void setBookId(int bookId) {
    	this.bookId = bookId;
   }   
    public int getBookId() {
     	return bookId;
   }
    public void setBookName(String bookName) {
     	this.bookName = bookName;
   }
   public String getBookName() {
     	return bookName;
   }
   public void setPrice(double price) {
   	this.price = price;
   }
   public double getPrice() {
    	return price;
   }
   public void setAuthor(Author author) {
    	this.author = author;
   }
   public Author getAuthor() {
    	return author;
   }  

 }

 
 class Author {

   private int authorId;
   private String authorName;
   private String email;
    
    Author(int authorId,String authorName,String email) {
    this.authorId = authorId;
    this.authorName = authorName;
    this.email = email;
   }

  public void setAuthorId(int authorId) {
   this.authorId = authorId;
  }
  public int getAuthorId() {
    return authorId;
  }
  public void setAuthorName(String authorName) {
   this.authorName = authorName;
  }
  public String getAuthorName() {
    return authorName;
  }
  public void setEmail(String email) {
   this.email = email;
  }
  public String getEmail() {
    return email;
  } 

} 

 class BookAuthorMain {

     public static void main(String[] args) {

     Author author1 = new Author(1111,"James","james@tmail.com");

      Book book1 = new Book(10,"JavaInAction",500,author1);    
       
      int bookId = book1.getBookId();
      String bookName = book1.getBookName();
      double price = book1.getPrice();
      Author author = book1.getAuthor();

      System.out.println("Book Details:");
      System.out.println("BookId:"+bookId);
      System.out.println("Name:"+bookName);
      System.out.println("Price:"+price);
      System.out.println("Author Details:");      
      System.out.println("Author Name:"+author.getAuthorName());  
      System.out.println("Email:"+author.getEmail());       
       
     }
  }









    
