package abstractfactory.koszyk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Data // getter + setter + equals + hashCode + toString
// getPrice zostal dodany przez adnotacje Data
@EqualsAndHashCode(callSuper = true)
public class Book extends Product {

  private String autor;
  private String title;
  private String publisher;
  private String ISBN;

  @Override
  public String getSummary() {
//    String.format("Book price cannot be below 0, "
//        + "actual value is: %s", price);
    return String.format("%s, %s : %s", autor, title, price);
  }
}
