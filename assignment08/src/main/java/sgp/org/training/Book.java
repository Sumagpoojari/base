package sgp.org.training;

public class Book implements Readable{
    private String title;
    private String author;
    private double price;
    private int publicationYear;
    //constructor
    public Book(String nameOfTheBook, String writer, double cost, int year){
        title = nameOfTheBook;
        author = writer;
        price = cost;
        publicationYear = year;
    }
    //getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.println("Book Name : "+title+" by author "+author+" published in the year "+publicationYear);
        System.out.println("Price of the book is Rs "+price);
    }
    public void discountedPrice(double discountPercentage){
        System.out.println("MRP : "+price);
        price = price - price*(discountPercentage/100);
        System.out.println("Discounted Price for you : "+price);
    }

    @Override
    public void read() {
        System.out.println(title+" is being read");
    }

    @Override
    public String getSummary() {
        return "This \""+title+"\" book for you from our well known author "+author+".\nHope this will provide the knowledge with respect to your choice.";
    }
}
