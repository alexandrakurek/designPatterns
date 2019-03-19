package abstractfactory.koszyk;

import lombok.Data;

@Data
public class Apple extends Fruit {

  private double sourness = 5;
  private Color color = Color.RED;
  private String type;

  public Apple(String type) {
    this.type = type;
  }

  @Override
  public String getSummary() {
    return String.format("Apple %s %s, sourness: %s",
        color, type, sourness);
  }

  @Override
  public double getSourness() {
    return sourness;
  }

  @Override
  public Color getColor() {
    return color;
  }

  public String getType() {
    return type;
  }
}
