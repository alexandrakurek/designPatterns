package abstractfactory.koszyk;

import lombok.Data;

@Data
public abstract class Product {

  protected double price;

  public abstract String getSummary();
}
