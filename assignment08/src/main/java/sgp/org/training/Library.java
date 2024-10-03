package sgp.org.training;

public class Library {
    public static void main(String[] args) {
        Book[] bookList = new Book[6];
        bookList[0] = new Book("Indian Cultures as Heritage", "Romila Thapar", 599, 2018);
        bookList[1] = new Book("The Alchemist", "Paulo Coelho", 399, 2005);
        bookList[2] = new Book("12 Rules For Life", "Peterson, Jordan B", 499, 2019);
        bookList[3] = new Ebook("12 Rules For Life", "Peterson, Jordan B", 499, 2019, 25);
        bookList[4] = new Ebook("Rich Dad Poor Dad", "Robert T. Kyosaki", 350, 2017, 20);
        bookList[5] = new Book("Life's Amazing Secrets", "Gaur Gopal Das", 159, 2018);

        for(Book eachBook : bookList){
            System.out.println("---------------------------------");
            //eachBook.displayInfo();
            //eachBook.read();
            //System.out.println(eachBook.getSummary());
            eachBook.discountedPrice(10.0);

        }
    }
}
