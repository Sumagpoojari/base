package sgp.org.training;

public class Ebook extends Book{
    private double fileSize;

    public Ebook(String nameOfTheBook, String writer, double cost, int year, double size) {
        super(nameOfTheBook, writer, cost, year);
        fileSize = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size of this file is "+fileSize);
    }

    @Override
    public void discountedPrice(double discountPercentage) {
        discountPercentage =+ 10;
        super.discountedPrice(discountPercentage);
    }
}
