package abstractfactory.koszyk;

import java.util.Random;

public class BookFactory implements ProductFactory {

  private static String[] authors = {"Sapkowski", "Zajdel", "Tolkien"};
  private static String[] titles = {"Wiedzmin", "LOTR", "Garry"};
  private static String[] publishers = {"PWN", "Sowa", "Supernova"};

  @Override
  public Product getProduct() {
    Random random = new Random();
    Book book = new Book(
        authors[random.nextInt(3)],
        titles[random.nextInt(3)],
        publishers[random.nextInt(3)],
        "978-83-951679-0-4");
    book.setPrice(10.99);
    return book;
  }
}